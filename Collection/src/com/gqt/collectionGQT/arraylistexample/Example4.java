package com.gqt.collectionGQT.arraylistexample;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
	 ArrayList al =new ArrayList();
     al.add(10);
     al.add(20);
     al.add(30);
     al.add("sachin");
     al.add(10);
     al.add(40);
     al.add(50);
     al.add(10);
     System.out.println(al);
     Class<? extends ArrayList> class1 = al.getClass();
     System.out.println(class1);
     int hashCode = al.hashCode();
     System.out.println(hashCode);
     ArrayList al1 = new ArrayList();
     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);
     al.add(500);
     int hashCode2 = al1.hashCode();
     System.out.println(hashCode2);
     int indexOf = al.indexOf(10);
     System.out.println(indexOf);
     int indexOf2 = al.indexOf("sachin");
     System.out.println(indexOf2);
     ArrayList al2 = new ArrayList();
     boolean empty = al.isEmpty();
     System.out.println(empty);
     boolean empty1 = al2.isEmpty();
     System.out.println(empty1);
     int lastIndexOf = al.lastIndexOf(2000);
     System.out.println(lastIndexOf);
     al.remove(7);
     System.out.println(al);
     ArrayList al3 = new ArrayList();
     al3.add("Lakshmi");
     al3.add("katrina");
     al3.add("Radhika pandith");
     al3.addAll(al3);
     System.out.println(al2);
     al2.remove(al3);
     System.out.println(al2);
     al.set(3,"Dravid");
     System.out.println(al);
	}
	

}
