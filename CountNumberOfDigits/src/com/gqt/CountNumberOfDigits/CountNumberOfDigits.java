package com.gqt.CountNumberOfDigits;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num=1234567890;
		int count=0;
		while(num>0)

		{
			num=num/10;
			count++;
		}
		System.out.println("Number Of Digits:" +count);
	}

}
