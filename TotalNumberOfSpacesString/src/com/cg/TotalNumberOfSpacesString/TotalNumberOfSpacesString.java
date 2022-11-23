package com.cg.TotalNumberOfSpacesString;

import java.util.Scanner;

public class TotalNumberOfSpacesString {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Enter the name:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		sentence= sentence.toLowerCase();
		
	for(int i=0; i<sentence.length();i++)
	{
		char ch=sentence.charAt(i);
		if(ch==' ')
		{
		count++;	
		}
	}
		
	System.out.println("Total number of spaces:"+count);	
	}

}
