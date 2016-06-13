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
	
	public Hashtable<String, ArrayList<Event>> relationDistanceTable(ArrayList<Event> allMyEvents){
		
		Hashtable<String, ArrayList<Event>> result = new Hashtable<String, ArrayList<Event>>();
		
		for(Event e : allMyEvents){
			ArrayList<Applier> allAppliers = e.getAllApplier();	// here would be error because of the method name in Event to get all the appliers.
			for(Applier a : allAppliers){
				String id = a.getNumber(); // here would be error because of the method name in Applier to get its id(or called number).
				ArrayList<Event> events;
				if(!result.containsKey(id)) events = new ArrayList<Event>();
				else events = result.get(id);
				events.add(e);
				result.put(id, events);
			}
		}
		
		return result;
	}
	
	public RelationJsonPack RelationJsonPacker(String me, Hashtable<String, ArrayList<Event>> table){
		
		ArrayList<LittleJsonPack> ljpList = new ArrayList<LittleJsonPack>();
		LittleJsonPack ljp = new LittleJsonPack(me, new ChildJsonPack(me, 40));
		ljpList.add(ljp);
		for(String key : table.keySet()){
			int size = table.get(key).size() * 2;
			if(size > 20) size = 20;
			ljp = new LittleJsonPack(key, new ChildJsonPack(key, size));
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