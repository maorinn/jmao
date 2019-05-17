package com;
public class MyThread extends Thread {
	private long delay;
	public MyThread(String str,long delay){
		super(str);
		this.delay = delay;
	}
	public void run(){
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName()+":\t第"+i+"次运行!");
			try{
				sleep(delay);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+":\t结束！");
	}
	public static void main(String[] args) {
		
		

	}
}