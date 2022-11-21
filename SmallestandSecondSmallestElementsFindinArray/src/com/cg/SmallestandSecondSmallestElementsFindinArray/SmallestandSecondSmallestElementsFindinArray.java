package com.cg.SmallestandSecondSmallestElementsFindinArray;

import java.util.Arrays;

public class SmallestandSecondSmallestElementsFindinArray {

	public static void main(String[] args) {
		
		int arr[]= {99,10,85,60,59,100,1};
		int n =  arr.length;
		Arrays.sort(arr);
		
		System.out.println("Smallest element:" +arr[0]);
		System.out.println("Second smallest element is: "+arr[1]);
	}

}
