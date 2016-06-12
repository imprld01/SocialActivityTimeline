package com.model;

import com.web.*;
import com.model.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import javax.servlet.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataAnalysis{
	
	public int[] getSexRatio(ArrayList<Apply> aList){
		int sex[2];//0:boy, 1:girl
		for(Apply apply:aList){
			if(apply.sex.equals("male")){
				sex[0]++;
			}else{
				sex[1]++;
			}
		}
		return sex;
	}
	
	public ArrayList<Event> getHitRatio(ArrayList<Event> eList){//a function to find top10
		ArrayList<int> hitArray = new ArrayList<int>();
		ArrayList<Event> top10 = new ArrayList<Event>();
		for(Event event:eList){
			hitArray.add(event.CTR);
		}
		for(int i=1;i<=10;i++){
			top10.add(eList.get(find(hitArray,i)));
		}
		return top10;
	}
	
	private int find(ArrayList<int> array, int k){
		Arraylist<int> list = new ArrayList<int>();
		for (int i = 0; i < array.size(); ++i){
			int n = array.get(i);
			int j = 0;
			for (int length = Math.Min(list.size(), k); j < length; ++j)
				if (n > list.get(j))
					break;
			if (j < k)
				list.add(j, n);
		}
		return list.get(k-1);
	}
	
	public ArrayList<Event> whatIParticipateIn(String me){
		
		ArrayList<Event> result = new ArrayList<Event>();
		EventProcess ep = (EventProcess)getServletContext().getAttribute("event");
		
		ArrayList<Event> allEvents = ep.getAllEvents();	// here would be error because of the method name in EventProcess to get all the events.
		for(Event e : allEvents){
			ArrayList<Applier> allAppliers = e.getAllApplier();	// here would be error because of the method name in Event to get all the appliers.
			for(Applier a : allAppliers){
				if(a.getNumber().equals(me)){ // here would be error because of the method name in Applier to get its id(or called number).
					result.add(e); break; 
				}
			}
		}
		
		return result;		
	}
	
	public Hashtable<String, Integer> relationDistanceTable(String me, ArrayList<Event> allMyEvents){
		
		boolean me_appear = false;
		Hashtable<String, Integer> result = new Hashtable<String, Integer>();
		
		for(Event e : allMyEvents){
			ArrayList<Applier> allAppliers = e.getAllApplier();	// here would be error because of the method name in Event to get all the appliers.
			for(Applier a : allAppliers){
				String id = a.getNumber(); // here would be error because of the method name in Applier to get its id(or called number).
				if(!id.equals(me)){
					if(!result.containsKey(id)) result.put(id, 2);
					else{
						int new_value = result.get(id) + 2;
						if(new_value > 20) new_value = 20;
						result.put(id, new_value);
					}
				}else if(!me_appear){ result.put(id, 40); me_appear = true; }
			}
		}
		
		return result;
	}
	
	public RelationJsonPack RelationJsonPacker(Hashtable<String, Integer> table, String me){
		
		ArrayList<LittleJsonPack> ljpList = new ArrayList<LittleJsonPack>();
		LittleJsonPack ljp = new LittleJsonPack(me, new ChildJsonPack(me, table.get(me)));
		ljpList.add(ljp); table.remove(me);
		for(String key : table.keySet()){
			ljp = new LittleJsonPack(key, new ChildJsonPack(key, table.get(key)));
			ljpList.add(ljp);
		}
		
		return new RelationJsonPack("flare", ljpList);
	}
	
	public void Relation2JsonFile(RelationJsonPack rjp, String fileName) throws IOException {
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(rjp);
		
		File flare = new File(fileName);
		FileWriter fw = new FileWriter(flare, false);
		fw.write(jsonStr);
		fw.close();
	}
}