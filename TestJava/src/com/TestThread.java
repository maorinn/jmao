package com;

public class TestThread {
public static void main(String[] args) {
	Thread t1 = new MyThread("�߳�A",1000);
	Thread t2 = new MyThread("�߳�B",2000);
	Thread t3 = new MyThread("�߳�C",3000);
	t1.start();
	t2.start();
	t3.start();
	System.out.println("��ǰ����߳���Ŀ:"+Thread.activeCount());
}
}
