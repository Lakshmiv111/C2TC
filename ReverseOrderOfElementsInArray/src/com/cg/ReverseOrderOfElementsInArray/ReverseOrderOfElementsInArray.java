package com.cg.ReverseOrderOfElementsInArray;

public class ReverseOrderOfElementsInArray {

	public static void main(String[] args) {
		
	int[]arr= {12,23,34,45,67,78,89,22,33,41,24,25,88,26,18,98,65};
	int n=arr.length;
	int[]b=new int[n];
	int j = n;
	
	for(int i=0;i<n;i++)
	{
		b[j-1]=arr[i];
		j=j-1;
	}
	System.out.println("Reversed Array is: \n");
	for(int k=0;k<n;k++)
	{
		System.out.println(b[k]);
	}
	}

}
