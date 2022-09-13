package com.cg.encapsulation;

public class Dog {

	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	
	//Independent getter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAge() {
		return age;
	}

	//Independent setter methods
	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	void run()
	{
		System.out.println("Dog runs");
	}

	void sleep()
	{
		System.out.println("Dog sleeps");
	}
public class code1{
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		System.out.println("----common setter and getter methods Results----");
		d.setData("tom","white",5000,3,"GR");
		d.getData();
		
		
		System.out.println("-----------");
		System.out.println("----Independent setter and getter methods results----");
      
		d.setName("Bruno");
		System.out.println(d.getName());
		
		d.setColor("black");
		System.out.println(d.getColor());
		
		d.setCost(5000);
		System.out.println(d.getCost());
		
		d.setAge(3);
		System.out.println(d.getAge());
		
		d.setBreed("GR");
		System.out.println(d.getBreed());
	
		
	}
}
public void setData(String string, String string2, int i, int j, String string3) 
{
	name = "tom";
	color= "black";
	cost=5000;
	
	
}

public void getData() {

	//"tom","white",5000,3,"GR");
}


}