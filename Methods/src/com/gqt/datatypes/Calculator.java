package com.gqt.datatypes;

public class Calculator {

	int add(int a,int b, int c){
		int d=a+b+c;
		return d;
	}
	
	
	public static void main(String[] args) {
	 Calculator d = new Calculator();
	System.out.println(d.add(1,2,3));

	}

}
