package com.cg.encapsulation;

public class tiger
{
 private String name;
 private String color;
 private int cost;
 private int age; 
 private String breed;
 
 
  void setData(String s1, String s2, int i1, int i2, String s3) // setter method
  {
	  name=s1;
	  color=s2;
	  cost=i1;
	  age=i2;
	  breed=s3;
  }

  void getData()  // getter method
  {
	  System.out.println(name);
	  System.out.println(color);
	  System.out.println(cost);
	  System.out.println(age);
	  System.out.println(breed);
  }
  void run()
	{
		System.out.println("tiger is runing");
	}
	void sleep()
	{
		System.out.println("tiger is sleeping");
	}
	
  public class code1{
	public static void main(String[] args)
	{
     tiger t = new tiger();
     t.setData("Dave", "orange with black stripes",13800000, 10, "sumatran");
     
    
     t.getData();
     t.run();
     t.sleep();
     
	}
  }
}
