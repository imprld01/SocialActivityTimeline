package com.model;

public class RelationJsonPack {

	private String name;
	private ArrayList<LittleJsonPack> children;
	
	public RelationJsonPack(String name, ArrayList<LittleJsonPack> one) {
		
		setName(name);
		setChild(one);
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<LittleJsonPack> getChildren() {
		return this.children;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setChild(String child) {
		this.child = child;
	}
}