package com;

public class test {
	public static void main(String[] args) {
		clist clist = new clist("1");
		clist clist2 = new clist("2");
		clist clist3 = new clist("3");
		//clist clist4 = new clist("4");
		clist.add(clist2);
		clist.add(clist3);
		clist.delete(clist2);
		clist.show();
		//System.out.println(clist.getnext().getpre().getdata()a);
	}
}
