package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataAnalysis{

	public int[] getSexRatio(ArrayList<Applicant> applicantList){
		int sex[] = new int[2];
		for(Applicant applicant : applicantList){
			if(applicant.getSex().equals(Sex.MALE)){
				sex[0]++;
			}else{
				sex[1]++;
			}
		}
		return sex;
	}
	
	public ArrayList<Event> getHitRatio(ArrayList<Event> eList){
		ArrayList<Integer> hitArray = new ArrayList<Integer>();
		ArrayList<Event> top10 = new ArrayList<Event>();
		for(Event event:eList){
			hitArray.add(event.getCTR());
		}
		for(int i=1;i<=10;i++){
			top10.add(eList.get(find(hitArray,i)));
		}
		return top10;
	}
	
	private int find(ArrayList<Integer> array, int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.size(); ++i){
			int n = array.get(i);
			int j = 0;
			for (int length = Math.min(list.size(), k); j < length; ++j)
				if (n > list.get(j))
					break;
			if (j < k)
				list.add(j, n);
		}
		return list.get(k-1);
	}

	public Hashtable<Applicant, Integer> calRelationScoreTable(ArrayList<Event> master, ArrayList<Event> eventFilter){
		
	}
	
	public ArrayList<Map.Entry<Applicant, Integer>> sortRlationTable(Hashtable<Applicant, Integer> t){
		
		ArrayList<Map.Entry<Applicant, Integer>> l = new ArrayList<Map.Entry<Applicant, Integer>>(t.entrySet());
		Collections.sort(l, new Comparator<Map.Entry<Applicant, Integer>>(){
			public int compare(Map.Entry<Applicant, Integer> o1, Map.Entry<Applicant, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		return l;
    }
	
	public String RelationAnalysis(Hashtable<Applicant, Integer> table){
		
		ArrayList<RelationLink> rls = new ArrayList<RelationLink>();
		
		
		
		return prepareRelationJson_BadMethod(rls);		
	}
	
	public String prepareRelationJson_BadMethod(ArrayList<RelationLink> allRelations){
		
		String result = "{container: document.getElementById('cy'),boxSelectionEnabled: false,autounselectify: true,layout: {name: 'dagre'},style: [{selector: 'node',style: {'content': 'data(id)','text-opacity': 0.5,'text-valign': 'center','text-halign': 'right','background-color': '#11479e'}},{selector: 'edge',style: {'width': 4,'target-arrow-shape': 'triangle','line-color': '#9dbaea','target-arrow-color': '#9dbaea','curve-style': 'bezier'}}],elements: {nodes: [";
		
		//add nodes
		
		result += "],edges: [";
		
		//add edges
		
		result += "]},}";
		return result;		
	}
	
	public ArrayList<Event> whatIParticipateIn(String kwd) {
		
		ArrayList<Event> result = new ArrayList<Event>();
		EventProcess ep = (EventProcess)getServletContext().getAttribute("event");
		
		ArrayList<Event> allEvents = ep.getEventList();
		for(Event e : allEvents){
			ArrayList<Applier> allAppliers = e.getApplicantList();
			for(Applier a : allAppliers){
				if(a.getNumber().equals(me)){
					result.add(e); break; 
				}
			}
		}
		
		return result;		
	}
	
	/*
	public Hashtable<String, ArrayList<Event>> relationDistanceTable(ArrayList<Event> allMyEvents){
		
		Hashtable<String, ArrayList<Event>> result = new Hashtable<String, ArrayList<Event>>();
		
		for(Event e : allMyEvents){
			ArrayList<Applier> allAppliers = e.getApplicantList();
			for(Applier a : allAppliers){
				String id = a.getNumber();
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
		
		int max_value = 0;
		LittleJsonPack ljp;
		ArrayList<LittleJsonPack> ljpList = new ArrayList<LittleJsonPack>();
		
		for(String key : table.keySet()){
			int size = table.get(key).size() * 2;
			if(size > max_value) max_value = size;
			ljp = new LittleJsonPack(key, new ChildJsonPack(key, size));
			ljpList.add(ljp);
		}
		
		ChildJsonPack temp_me = new ChildJsonPack(me, max_value + 20);
		ljp = new LittleJsonPack(me, temp_me);
		ljpList.add(ljp);
		
		return new RelationJsonPack(me, ljpList);
	}

	public void Relation2JsonFile(RelationJsonPack rjp, String fileName) throws IOException {
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(rjp);
		
		File flare = new File(fileName);
		FileWriter fw = new FileWriter(flare, false);
		fw.write(jsonStr);
		fw.close();
	}
	*/
}