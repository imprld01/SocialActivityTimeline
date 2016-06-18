package com.model;

public class RelationTableEntry {

	private String who;
	private ArrayList<Event> intersection;
	private ArrayList<Event> nointersection;
	
	public RelationLink(String who) {
		
		this.who = who;
		intersection = new ArrayList<Event>();
		nointersection = new ArrayList<Event>();
	}
	
	public String getWho() {
		return this.who;
	}
	
	public ArrayList<Event> getIntersection() {
		return this.intersection;
	}
	
	public ArrayList<Event> getNointersection() {
		return this.nointersection;
	}
	
	public void setWho(String in) {
		this.who = in;
	}
	
	public void addIntersection(Event in) {
		this.intersection.add(in);
	}
	
	public void addNointersection(Event in) {
		this.nointersection.add(in);
	}
	
	public int calSize(){
		return intersection.size() + nointersection.size();
	}
}