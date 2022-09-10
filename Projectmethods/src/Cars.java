
public class Cars {
    String name;
    String model;
    int year;
    int cost;
	String color;
	
	void disel()
	{
		System.out.println("car disel");
	}
	void myleage()
	{
		System.out.println("car myleage");
	}
	void speed()
	{
		System.out.println("car speed ");
	}
	void comfort()
	{
		System.out.println("car comfort");
	}
	
	public class coding{
		public static void main(String[] args) {
			
			Cars c = new Cars();
			
			System.out.println("The name of car");
			System.out.println("The name of color");
			System.out.println("The name of cost");
			System.out.println("The name of year");
			
			c.color= "Blue";
			c.cost= 582000000;
			c.model= "Nano";
			c.year= 2022;
			
			System.out.println("The name of car: +c.name");
			System.out.println("The name of color: +c.color");
			System.out.println("The name of cost: +c.cost");
			System.out.println("The name of year: +c.year");
		
	c.disel();
	c.myleage();
	c.speed();
	c.comfort();
			
	}
	}
	
	
}	
	
	
	
	
	
	
	
	

	


