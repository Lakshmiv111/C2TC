package com.cg.methods;

public class Cars
{
	String brand;
	String model;
	int cost;
	int topspeed;
	 
	void move(int distance)
	{
		distance++;
	}
   void reverse(int distance)
{
	distance--;
}
	void stop()
	{}
}
  class ActivationRecord {
	 public static void main(String[] args) {

  Cars c1 = new Cars();
 c1.brand="Lamborghini";
 c1.model="Aventador";
 c1.cost=56200000;
 c1.topspeed=351;
		 
 
 Cars c2 = new Cars();
 c2.brand="Ferrari";
 c2.model="812 Superfast";
 c2.cost=52000000;
 c2.topspeed=340;
		 
 
 Cars c3= new Cars();
 c3.brand="Ferrari";
 c3.model="488 GTB";
 c3.cost=368000000;
 c3.topspeed=330;
		 
 
 c1.move(0);
 c1.reverse(0);
 c1.stop();
 
 c2.move(0);
 c2.reverse(0);
 c2.stop();
 
 
 c3.move(0);
 c3.reverse(0);
 c3.stop();
 
 
 System.out.println("Lamborghini"); 
 System.out.println("Ferrari");
 System.out.println("Ferrari");
		 
	}

}
