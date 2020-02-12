package com.ibm.eis.bean;

public class Employee {
	private String name;
	private int id;
	private String design;
	private int salary;
	private String scheme;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return design;
	}
	public void setDesignation(String design) {
		this.design = design;
	}
    
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	@Override
	public String toString() {
		return "Employee [name: " + name + ", id: " + id + ", salary: " + salary + ", designation: " + design + "]";
	}
}
