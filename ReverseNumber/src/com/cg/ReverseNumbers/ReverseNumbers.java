package com.cg.ReverseNumbers;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		
/*Using StringBuffer and StringBuilder class method we can print any numbers in reverse
order because in the StringBuffer and StringBuilder class there is a method
called reverse method*/	
		
	StringBuffer sb = new StringBuffer(String.valueOf(num));	
	StringBuffer rev = sb .reverse();
	
	System.out.println(" Reverse Number is:" +rev);	
		
		
	}

}
