package com.cg.CountThePositiveNegativezeroesInArray;

public class CountThePositiveNegativezeroesInArray {

	public static void main(String[] args) {
		
		int arr[]= {-5,-6,-10,-25,-36,0,2,96,66,85,45,0};
		int PositiveCount=0;
		int NegativeCount=0;
		int ZeroCount=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				PositiveCount++;
			}
			else if(arr[i]<0)
			{
				NegativeCount++;
			}
			else
			{
				ZeroCount++;
			}
		}
System.out.println("total number of positive number:" +PositiveCount);
System.out.println("total number of Negative number:" +NegativeCount);
System.out.println("total number of Zero number:" +ZeroCount);
	}

}
