package com.yhk;

public class tese {
 public static void main(String[] args) {
	yhk yhk1 = new yhk(01, 01);
	yhk yhk2 = new yhk(02, 02);
	yhk1.Save_money(500);
	System.out.println("账户一余额:"+yhk1.show());
	yhk2.Withdraw_money(800);
	System.out.println("账户二余额:"+yhk2.show());
}
}
