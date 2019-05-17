package com.emp;

public class emp {
	private Integer id;
	private double salary;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public emp(Integer id,double salary,String name) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public emp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
