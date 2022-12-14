package com.cg.framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalary;
	 private static final float MINBAL=500;
	 public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	 
    public void withdraw(float accBal)
	{

		System.out.println("Remaining balance after withdraw :"+accBal);
	}

    public boolean isSalary() {
		return isSalary;
	}
	
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	
	public static float getMinbal() {
		return MINBAL;
	}	
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
