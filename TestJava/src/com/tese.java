package com;

import java.util.Random;

import javax.swing.JOptionPane;

public class tese {
	
public static void main(String[] args) {
	//p185������
	Random random = new Random();
	int i = 0,z = 0,f = 0;
	String regex = "[a-zA-Z]\\w*[@]\\d{3,3}+[.]\\w{2,}";
	for(i=0;i<=5;i++){
		String input = JOptionPane.showInputDialog("��������������ַ:");
		if(input.matches(regex)){
			System.out.println(input+"����Ч�ĵ����ʼ���");
		}else{
			System.out.println(input+"��������Ч�ĵ����ʼ���");
		}
	}
	//p185��ʮ����
//	for(i=0;i<1000;i++){
//		if(random.nextInt(2) == 0){
//			z++;
//		}else{
//			f++;
//		}
//	}
//	System.out.println("���湲����"+z+"��\n���湲����"+f+"��");
	
}

}