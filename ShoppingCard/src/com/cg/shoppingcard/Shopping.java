package com.cg.shoppingcard;

import java.util.Scanner;

public class Shopping {

		public static void main(String[] args) {
	//TODO Auto-Generated method stub
			int ch;
			Scanner in = new Scanner(System.in);//import scanner
			
			System.out.println("Enter your Email Address:");
		    String emailaddress = in.next();
		    
			System.out.println("Enter your Name:");
			String name=in.next();	
			
			String s1="laptop";
			System.out.println(1+". laptop");
			
			String s2="Charger";
			System.out.println(2+".Charger");
			
			String s3="Electronic Appliances";
			System.out.println(3+".Electronic Appliances");
			
			String s4="Car";
			System.out.println(4+".Car");
			
			String s5="Jewellery";
			System.out.println(5+".Jewellery");
			
			String s6="Mobiles";
			System.out.println(6+".Mobiles");
			
			System.out.println("Enter your choice:");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Samsung Galaxy");
				System.out.println("Lenovo");
				System.out.println("Dell Latitude");
				System.out.println("Apple Macbook");
				System.out.println(" HP Elitebook");
				break;
				
			case 2:
				System.out.println("MD Gold Flash");
				System.out.println("Amazon 5W USB");
				System.out.println("Apple Md836hn");
				System.out.println("SonicCharge");
				System.out.println("St India Micro usb");
				break;
				
			case 3:
				System.out.println("Refrigerator");
				System.out.println("Induction cooktop");
				System.out.println("Wonderchef Nutri Pot Electic");
				System.out.println("Pulverizer Machine");
				System.out.println("Wahing Machine");
				break;
				
			case 4:
				System.out.println("Mercedes-Benz");
				System.out.println("OPEL");
				System.out.println("Suzuki");
				System.out.println("TATA Motors");
				System.out.println("Volkswagen");
				break;
				
			case 5:
				System.out.println("Rings");
				System.out.println("Bracelet");
				System.out.println("Bangles");
				System.out.println("Necklaces");
				System.out.println("Diamond");
				break;
				
			case 6:
				System.out.println("Samsung Galaxy");
				System.out.println("Redmi Note");
				System.out.println("Apple iPhone");
				System.out.println("OPPO");
				System.out.println("Vivo");
				break;
				default:
				System.out.println("THANK YOU FOR VISITING");
				break;
					
			}
	}
}