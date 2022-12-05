package com.cg.StaticTypeArrayAgeAndWeights;

public class StaticTypeArrayAgeAndWeights {

	public static void main(String[] args) {
		
	 String arr[][]= new String [3][2];
		arr[0][0]=" Age:30  Weight:89";
		arr[1][0]=" Age:38  Weight:56";
		arr[2][0]=" Age:24  Weight:69";
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
System.out.println("The age and weight of the person" +(i+1)+ "From:" +(j+2)+ "is:" +arr[i][j]);
			}
		}

	}

}
