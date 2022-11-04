package com.gqt.CollectionGQT.arraylistexample;

import java.util.PriorityQueue;

public class Example6 {
/*
 PriorityQueue makes use of Min Heap DataStructure
 PriorityQueue store the data based on Min Heap DataStructure which 
 will store the element with min value in the first postion.
 */
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);
		
	}

}
