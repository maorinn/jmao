package com;

public class emp {
	private int empid;
	private String name;
	private double Salary;
	public emp(int empid, String name, double salary2) {
		super();
		this.empid = empid;
		this.name = name;
		Salary = salary2;
	}
	
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary2) {
		Salary = salary2;
	}
	
}
