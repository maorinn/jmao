package com.LinearTable;

public class queue {
	private int[] queue;
	public void newqueue() {
		queue = new int[0];
	}
	public void add(int val) {
		int [] newqueue = new int[queue.length+1];
		for (int i = 0; i < queue.length; i++) {
			newqueue[i] = queue[i];
		}
		newqueue[queue.length] = val;
		queue = newqueue;
	}
	public int Departure() {
		int val = queue[queue.length-1];
		int[] newqueue = new int[queue.length-1];
		for (int i = 0; i < newqueue.length; i++) {
			newqueue[i] = queue[i+1];
		}
		queue = newqueue;
		return val;
	}
	public void show() {
		for(int a : queue){
			System.out.println(a);
		}
	}
	public boolean isnull() {
		return queue.length == 0;
	}
}
