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
	//����Ա��
	public void emprr() {
		System.out.println("������Ա������:");
		String name = su.nextLine();
		System.out.println("������Ա������:");
		int id = su.nextInt();
		
		System.out.println("������Ա��н��:");
		double Salary = su.nextDouble();
			arrayList.put(id, new emp(id, name, Salary));
			System.out.println("���ӳɹ���");
	}
	//�ж�id�Ƿ���ڣ����ڷ���id�ڼ��ϵ����������򷵻�false
	public boolean isemp(int id) {
		if (arrayList.get(id) != null) {
			return true;
		}else {
			return false;
		}
		
	}
	//����Ա�����Ų�ѯԱ����Ϣ
	public void empcx(int empid) {
		if (isemp(empid)) {
			emp emp = arrayList.get(empid);
			System.out.println("����Ϊ"+emp.getEmpid()+"Ա����Ϣ�ǣ� ����"+emp.getName()+"н�ʣ�"+emp.getSalary());
		}else {
			System.out.println("ϵͳ��û�����Ա����");
		}
	}
	//��ʾ����Ա����Ϣ
	public void empdisplay() {
		if (arrayList.size()<1) {
			System.out.println("ϵͳ��û��һ��Ա��");
		}
		Set<Integer> set = arrayList.keySet();
		for (Integer i:set) {
			emp emp = arrayList.get(i);
			System.out.println("����"+emp.getName()+"������"+emp.getEmpid()+"н�ʣ�"+emp.getSalary());
		}
	}
	//����Ա�������޸�н��
	public void modifySalary(int id,double salary) {
		emp emp = arrayList.get(id);
		emp.setSalary(salary);
		System.out.println("�޸ĳɹ���");
	}
	//ɾ��ָ��idԱ��
	public void empdelete(int id) {
		arrayList.remove(id);
		System.out.println("ɾ���ɹ���");
	}
	
}