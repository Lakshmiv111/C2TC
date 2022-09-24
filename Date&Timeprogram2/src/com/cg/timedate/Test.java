package com.cg.timedate;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {
		
		LocalDate birthday=LocalDate.of(1997, 1, 7);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday, today);	
System.out.printf("Age is %d Years %d Months %d Days", p.getYears(),p.getMonths(),p.getDays());

	}

}
