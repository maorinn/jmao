package com;

public class TestRunnable {
int p = 100;
int i;
public static void main(String[] args) {
	MyRunnable r1 = new MyRunnable();
	Thread t1 = new Thread(r1,"����һ");
	Thread t2 = new Thread(r1,"���ڶ�");
	Thread t3 = new Thread(r1,"������");
	Thread t4 = new Thread(r1,"������");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	


}
}