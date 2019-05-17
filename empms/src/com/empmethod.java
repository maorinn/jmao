package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.xml.bind.ValidationEvent;

public class empmethod {
	Map<Integer,emp> arrayList = new HashMap<>();
	Scanner su = new Scanner(System.in);
	//添加员工
	public void emprr() {
		System.out.println("请输入员工姓名:");
		String name = su.nextLine();
		System.out.println("请输入员工工号:");
		int id = su.nextInt();
		
		System.out.println("请输入员工薪资:");
		double Salary = su.nextDouble();
			arrayList.put(id, new emp(id, name, Salary));
			System.out.println("添加成功！");
	}
	//判断id是否存在，存在返回id在集合的索引，否则返回false
	public boolean isemp(int id) {
		if (arrayList.get(id) != null) {
			return true;
		}else {
			return false;
		}
		
	}
	//根据员工工号查询员工信息
	public void empcx(int empid) {
		if (isemp(empid)) {
			emp emp = arrayList.get(empid);
			System.out.println("工号为"+emp.getEmpid()+"员工信息是： 姓名"+emp.getName()+"薪资："+emp.getSalary());
		}else {
			System.out.println("系统中没有这个员工！");
		}
	}
	//显示所有员工信息
	public void empdisplay() {
		if (arrayList.size()<1) {
			System.out.println("系统中没有一个员工");
		}
		Set<Integer> set = arrayList.keySet();
		for (Integer i:set) {
			emp emp = arrayList.get(i);
			System.out.println("姓名"+emp.getName()+"，工号"+emp.getEmpid()+"薪资："+emp.getSalary());
		}
	}
	//根据员工工号修改薪资
	public void modifySalary(int id,double salary) {
		emp emp = arrayList.get(id);
		emp.setSalary(salary);
		System.out.println("修改成功！");
	}
	//删除指定id员工
	public void empdelete(int id) {
		arrayList.remove(id);
		System.out.println("删除成功！");
	}
	
}
