package com.cg.ConsonantsString;

import java.util.Scanner;

public class ConsonantsString {

	public static void main(String[] args) {
		
	int count=0;
	System.out.println("Enter the name:");	
    Scanner sc= new Scanner(System.in);	
    String sentence= sc.nextLine();
    sentence = sentence.toLowerCase();
    
    for(int i=0; i<sentence.length(); i++)
    {
    	char ch=sentence.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
    {
    	System.out.println(" ");
    }
    else if(ch!= ' ')
    {
    	count++;
    }
  }
    
    System.out.println("total number of consonants:"+count);
    
    
    
    
	}

}
