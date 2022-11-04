package com.cg.LinkedList;

import java.util.LinkedList;

public class Example6 {

/*It is a collection class which is present inside the package = java.util.LinkedList
It is internally making use of doubly linked list datastructure
It is more efficient in performing the data opertions like at the 
intermediate postion efficiently.
It is used to overcome all the disadvantages of the Array Data Structure.
*/
	public static void main(String[] args) {
		System.out.println("LinkedList");
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(100);
		ll.add(1000);
		ll.add(10000);
		ll.add(100000);	
		System.out.println(ll);
		
		ll.addFirst(200);
		ll.addFirst(3000);
		System.out.println(ll);
		
		ll.offer(5000);
		ll.offerFirst(6000);
		ll.offerLast(7000);
		System.out.println(ll);
		
		Integer p1 = ll.peek();
		System.out.println(p1);
		System.out.println(ll);
		
		Integer p2 = ll.poll();
		System.out.println(p1);
		System.out.println(ll);
		
		
		ll.push(111);
		ll.push(222);
		System.out.println(ll);
		
		ll.pop();
		System.out.println(ll);
		
		
	}

}
