package com;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner su = new Scanner(System.in);
		empmethod empmethod = new empmethod();
		while (true) {
		System.out.println("��ѡ�����¹���");
		System.out.println("1.����Ա��");
		System.out.println("2.�鿴����Ա����Ϣ");
		System.out.println("3.����Ա�����Ų�ѯָ����Ա����Ϣ");
		System.out.println("4.����Ա�������޸ĸ�Ա��нˮ");
		System.out.println("5.����Ա������ɾ����Ա��");
		System.out.println("6.�˳�ϵͳ");
			switch (su.nextInt()) {
			case 1:
				empmethod.emprr();
				break;
			case 2:
				empmethod.empdisplay();
				break;
			case 3:
				System.out.println("������Ա������:");
				int id = su.nextInt();
				empmethod.empcx(id);
				break;
			case 4:
				System.out.println("������Ա������:");
				int id2 = su.nextInt();
				System.out.println("��������Ҫ�޸ĵ�н��:");
				double salary = su.nextDouble();
				empmethod.modifySalary(id2, salary);
				break;
			case 5:
				System.out.println("��������Ҫɾ����Ա������:");
				int id3 = su.nextInt();
				empmethod.empdelete(id3);
				break;
			case 6:
				return;
			default:
				System.out.println("�����������������");
				break;
				
			}
			
		}

	}

}