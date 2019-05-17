package com;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner su = new Scanner(System.in);
		empmethod empmethod = new empmethod();
		while (true) {
		System.out.println("请选择以下功能");
		System.out.println("1.添加员工");
		System.out.println("2.查看所有员工信息");
		System.out.println("3.根据员工工号查询指定的员工信息");
		System.out.println("4.根据员工工号修改该员工薪水");
		System.out.println("5.根据员工工号删除该员工");
		System.out.println("6.退出系统");
			switch (su.nextInt()) {
			case 1:
				empmethod.emprr();
				break;
			case 2:
				empmethod.empdisplay();
				break;
			case 3:
				System.out.println("请输入员工工号:");
				int id = su.nextInt();
				empmethod.empcx(id);
				break;
			case 4:
				System.out.println("请输入员工工号:");
				int id2 = su.nextInt();
				System.out.println("请输入您要修改的薪资:");
				double salary = su.nextDouble();
				empmethod.modifySalary(id2, salary);
				break;
			case 5:
				System.out.println("请输入您要删除的员工工号:");
				int id3 = su.nextInt();
				empmethod.empdelete(id3);
				break;
			case 6:
				return;
			default:
				System.out.println("输入错误，请重新输入");
				break;
				
			}
			
		}

	}

}
