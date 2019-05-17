package com.LinearTable;

public class test {
	public static void main(String[] args) {
		Stack stack = new Stack();
		queue queue = new queue();
		stack.newStack();
		queue.newqueue();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.show();
		System.out.println(stack.isnull());
		stack.Popping();
		stack.show();
		System.out.println("----------------------------------------");
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.show();
		System.out.println(queue.isnull());
		queue.Departure();
		queue.show();
	}
}
