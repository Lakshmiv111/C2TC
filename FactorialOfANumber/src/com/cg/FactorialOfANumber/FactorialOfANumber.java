package com.cg.FactorialOfANumber;

public class FactorialOfANumber {

	public static void main(String[] args) {
		
/*		int num=10;
		long factorial = 1;
		for(int i=1; i<num; i++)
		{
			factorial=factorial*i;
		}
    System.out.println("Factorial of a Number is:" +factorial);
	}

}
*/
		int num=5;
		long factorial = 1;
		for(int i=num; i>=1; i--)
		{
			factorial=factorial*i;
		}
    System.out.println("Factorial of a Number is:" +factorial);
	}



	}
