package com.gqt.thread;

public class ThreadExample1 {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("Lakshmi");
		t.setPriority(8);
		System.out.println(t);
	}

}
