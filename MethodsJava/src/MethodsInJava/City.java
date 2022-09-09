package MethodsInJava;

public class City {

	String name;
	int population;
	String famousFor;
	boolean landlocked;
	
	void crowd() {
		if(population > 1000000)
			System.out.println("City is overcrowded");
		else
			System.out.println("City is good to live in");
	}
 void atmosphere() {
	 System.out.println("Compared to village, city lacks in grenary");
 }
}
class Village{
	String name;
	int population;
	String famousFor;
	boolean remote;
	

	void crowd() {
		if(population > 5000)
			System.out.println("Village is overcrowded");
		else
			System.out.println("Village is good to live in");
	}
	void atmosphere() {
		 System.out.println("Compared to city, village has plenty of grenary");
	 }
}

  class Program{
	public static void main(String[] args) {
		 City c = new City();
		 c.name = "Akola";
		 c.population = 700000;
		 c.famousFor = "Raj Rajeshwar Temple";
		 c.landlocked = true;
		 
		 System.out.println("c.name");
		 System.out.println("c.population");
		 System.out.println("c.famousFor");
		 System.out.println("c.landlocked");
		 
		 c.crowd();
		 c.atmosphere();
		 
		 System.out.println();
		 
		 Village v = new Village();
		 c.name = "Ugwa";
		 c.population = 5000;
		 c.famousFor = "Mahadev Temple";
		 c.landlocked = true;
		 
		 
		 System.out.println("c.name");
		 System.out.println("c.population");
		 System.out.println("c.famousFor");
		 System.out.println("c.landlocked");
		 
		 
		 
		
	}

}
