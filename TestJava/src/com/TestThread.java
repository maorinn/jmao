package com;

public class TestThread {
public static void main(String[] args) {
	Thread t1 = new MyThread("线程A",1000);
	Thread t2 = new MyThread("线程B",2000);
	Thread t3 = new MyThread("线程C",3000);
	t1.start();
	t2.start();
	t3.start();
	System.out.println("当前活动的线程数目:"+Thread.activeCount());
}
}
