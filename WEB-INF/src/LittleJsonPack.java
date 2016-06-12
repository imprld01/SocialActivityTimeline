package com.model;

public class LittleJsonPack {

	private String name;
	private ArrayList<ChildJsonPack> children;
	
	public RelationJsonPack(String name, ChildJsonPack one) {
		
		setName(id);
		children = new ArrayList<ChildJsonPack>();
		children.add(one);
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<ChildJsonPack> getChildren() {
		return this.children;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}