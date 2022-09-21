package com.gqt.linear;

//WAP to search for an element in the given array using linear search
//input:1,2,3,4,5
//key=3
//output: element found in position

public class Main {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int key=3;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				
			{
				System.out.println("the elementbis found at position: "+(i+1));
			}
		}
	}

}
