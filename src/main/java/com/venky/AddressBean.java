package com.venky;

public class AddressBean {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "AddressBean [getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
