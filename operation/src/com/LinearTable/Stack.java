package com.LinearTable;

public class Stack {
	private int[] Stack;
	public void newStack() {
		Stack = new int[0];
	}
	public void add(int val) {
		int[] newStack = new int[Stack.length+1];
		for (int i = 0; i < Stack.length; i++) {
			newStack[i] = Stack[i];
		}
		newStack[Stack.length] = val;
		Stack = newStack;
	}
	public int Popping() {
		int val = Stack[Stack.length-1];
		int[] newStack = new int[Stack.length-1];
		for (int i = 0; i < newStack.length; i++) {
			newStack[i] = Stack[i];
		}
		Stack = newStack;
		return val;
	}
	public void show() {
		for(int a : Stack){
			System.out.println(a);
		}
	}
	public boolean isnull() {
		return Stack.length == 0;
	}
}
