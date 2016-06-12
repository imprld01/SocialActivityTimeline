package com.model;

public class RelationJsonPack {

	private String name;
	private ArrayList<LittleJsonPack> children;
	
	public RelationJsonPack(String name, LittleJsonPack one) {
		
		setName(id);
		children = new ArrayList<LittleJsonPack>();
		children.add(one);
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
}