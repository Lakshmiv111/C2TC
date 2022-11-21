package com.gqt.CopyArrayCode;

public class CopyArray {

	public static void main(String[] args) {
		
		
 int arr1[]=new int[] {1,2,3,4,5,6,7,8,9};
 int arr2[]=new int[arr1.length];
 //for copying all elements of one array to another array
 
 for(int i=0; i<arr1.length; i++)
 {
	 arr2[i]=arr1[i];
 }	
 //displaying elements of array1
 System.out.println("Orginal Array:");
 
 for(int i=0; i<arr1.length; i++)
 {
	 System.out.println(arr1[i]+" ");
 }
	System.out.println("new array:");
	
	
	 for(int i=0; i<arr1.length; i++)
	 {
		 System.out.println(arr2[i]+" ");
	 }
		
	}

}
