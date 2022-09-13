package com.cg.encapsulation1;

public class Dog {

	
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	
	void setData(String s1,String s2, String s3, int i1, int i2)
	{
		name = s1;
		color = s2;
		breed = s3;
		cost = i1;
		age = i2;
	}
	
	void getData()
	{
		 System.out.println(name);
		  System.out.println(color);
		  System.out.println(cost);
		  System.out.println(age);
		  System.out.println(breed);
	}
	
	void run()
	{
		System.out.println("dog is runing");
	}
	void sleep()
	{
		System.out.println("dog is sleeping");
	}
	
	
	public class code{
	public static void main(String[] args) {
	  Dog d = new Dog ();
    d.setData("tom", "white", "GR", 3, 5000);	
    
    d.getData();
    d.run();
    d.sleep();

	}

	}
}
