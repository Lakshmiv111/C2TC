package com.cg.IntegerPresentArrayOrNot;

import java.util.Scanner;

public class IntegerPresentArrayOrNot {

	public static void main(String[] args) {
		
		int arr[]= {12,23,34,45,56,67,78,89,22,33,44,41,31,24,25,26,18,9,65};
		int flag=0;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element:");
        int find = sc.nextInt();
        
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]==find)
        	{
        		System.out.println(find+ "is present at"+i);
        		flag=1;
        	}
        }
        if(flag==0)
        {
            System.out.println(" Element Not Present");
        }
	}

}
