package com.bridge.springcore.model;

import com.google.gson.Gson;

public class Employee {
	
	private String name;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
}
