package com.cg.CompareTwoStrings;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		String s1 = new String("Ramayana");
		String s2 = new String("Ramayana"); //  String are equal
	//String s2 = new String ("sitayana"); //String are not equal
		
		if(s1.compareTo(s2)==0)
		{
			System.out.println("Strings are Equal");
		}
		else
			System.out.println("String are not equal");
		
	}

}
// There are five ways to compare two Strings in Java
/*
 1. Using user_defined function
 2. Using String.equals()
 3. Using String.equalsIgnorecase()
 4. Using Object.equals()
 5. Using String.CompareTo()
*/


