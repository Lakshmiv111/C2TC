package com.gqt.CollectionGQT.arraylistexample;

import java.util.TreeSet;
/*
 TreeSet makes use of Balanced Binary Tree Data Structure.
 TreeSet store the data in the sorted order.
 */
public class Example6 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
	}

}
