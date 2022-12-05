package com.cg.DynamicTypeAgeAndWeights;

import java.util.Scanner;

public class DynamicTypeAgeAndWeights {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		System.out.println("Enter the number of Column");
		int m=sc.nextInt();
		int arr[][]= new int[n][m];
		System.out.println("Enter The Elements:");
		for(int i=0 ; i<n;i++)
		{
			for(int j=0 ; j<m;j++)
			{
				arr[i][j]=sc.nextInt();			}
		}
System.out.println("Age and Weights:");
for(int i=0; i<n; i++)
{
	for(int j=0; j<m; j++)
	{
		System.out.println(arr[i][j]+ " ");
	}
	System.out.println();
}
	}

}
