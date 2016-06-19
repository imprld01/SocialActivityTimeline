package com.model;

public class RelationTableEntry {

	private String who;
	private int totalScore;
	private ArrayList<Event> intersection;
	private ArrayList<Event> nointersection;
	
	public RelationLink(String who) {
		
		this.who = who; totalScore = 0;
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
	
	public Integer getTotalScore(){
		return totalScore;
	}
	
	public void setWho(String in) {
		this.who = in;
	}
	
	public void addIntersection(Event in) {
		this.intersection.add(in); ++totalScore;
	}
	
	public void addNointersection(Event in) {
		this.nointersection.add(in); ++totalScore;
	}
}