package com.cg.Bank;

public class BankAccount {

	
	private int accno;
	private int balance;
	private String cust_name;
	private int pin;
	
	
	void setData(int accno,int balance, String cust_name, int pin)
	{
		this.accno=accno;
		this.balance=balance;
		this.cust_name=cust_name;
		this.pin=pin;
	}
	
	void getData()
	{
		System.out.println(accno);
		System.out.println(balance);
		System.out.println(cust_name);
		System.out.println(pin);
	}

	 public class code3{
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		b.setData(1234567890,10000,"lakshmi",1234);
		b.getData();
				
		
	}

}
	 
	 
}
