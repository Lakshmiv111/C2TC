package com.gqt.arraylist;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(30);
	     al.add(40);
	     al.add(50);
		System.out.println(al);
		al.add(2,100);
		System.out.println(al);
	    ArrayList al1 = new ArrayList();
	    al.add(10);
	    al.add(100);
	    al.add(1000);
	    al.add(10000);
	    al.add(100000);
	    al.addAll(al1);
	    System.out.println(al);
    	ArrayList al2 = new ArrayList();
	    al2.add(10);
	    al2.add("sachin");
	    al2.add('r');
	    al2.add(100.67f);
	    al2.add(345.678);
	    al2.add('&');
	    al2.addAll(6,al2);	 
	    System.out.println(al2);
	 // The reason why ArrayList is not efficient in intermediate
//opertaions is because we have to move the existing data on to the right side depending
	    // on number of data that we are adding.
	}

}
