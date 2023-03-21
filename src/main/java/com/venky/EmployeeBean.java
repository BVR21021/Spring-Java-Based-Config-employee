package com.venky;

public class EmployeeBean {

	private int id;
	private String name;
	private double salary;
	private AddressBean addr;
	@Override
	public String toString() {
		return "EmployeeBean [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getAddr()=" + getAddr() + "]";
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public AddressBean getAddr() {
		return addr;
	}
	public void setAddr(AddressBean addr) {
		this.addr = addr;
	}
	
	
	
}
