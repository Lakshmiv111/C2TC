package com.cg.MutableString;

public class MutableString {

	public static void main(String[] args) {
		
		StringBuffer s1= new StringBuffer("Ramu");
		StringBuffer s2= new StringBuffer("Rama");
		StringBuffer s3= new StringBuffer("Rama");
		StringBuffer s4= new StringBuffer("sita");
		
		System.out.println(s1);
		System.out.println(s2);
		boolean b = s1.equals(s2);
		System.out.println(b);
		
		String ss1 = s1.toString();
		String ss2 = s2.toString();
		String ss3 = s3.toString();
		String ss4 = s4.toString();
		
		if(ss1.equals(ss2)==true)
		{
			System.out.println("String s1 & s2 are compare and found to be equal");
		}
		
		if(ss1.equals(ss3)==true)
		{
			System.out.println("String s1 & s3 are compare and found to be equal");
		}
		
		if(ss1.equals(ss4)==true)
		{
			System.out.println("String s1 & s4 are compare and are found to be equal");
		}
		
		else
		{
			System.out.println("Strings are compare and found to be not equal");
		}
	}

}
