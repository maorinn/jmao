package com;

import java.util.Random;

import javax.swing.JOptionPane;

public class tese {
	
public static void main(String[] args) {
	//p185第七题
	Random random = new Random();
	int i = 0,z = 0,f = 0;
	String regex = "[a-zA-Z]\\w*[@]\\d{3,3}+[.]\\w{2,}";
	for(i=0;i<=5;i++){
		String input = JOptionPane.showInputDialog("请输入电子邮箱地址:");
		if(input.matches(regex)){
			System.out.println(input+"是有效的电子邮件！");
		}else{
			System.out.println(input+"不是是有效的电子邮件！");
		}
	}
	//p185第十二题
//	for(i=0;i<1000;i++){
//		if(random.nextInt(2) == 0){
//			z++;
//		}else{
//			f++;
//		}
//	}
//	System.out.println("正面共出现"+z+"次\n反面共出现"+f+"次");
	
}

}
