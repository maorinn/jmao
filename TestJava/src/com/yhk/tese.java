package com.yhk;

public class tese {
 public static void main(String[] args) {
	yhk yhk1 = new yhk(01, 01);
	yhk yhk2 = new yhk(02, 02);
	yhk1.Save_money(500);
	System.out.println("�˻�һ���:"+yhk1.show());
	yhk2.Withdraw_money(800);
	System.out.println("�˻������:"+yhk2.show());
}
}