
public class Dog1 {

 private String name;
 private String color;
 private int cost;
 private int age;
 private String breed;
	
	//common setter methods
  void setData(String name, String color, int cost, int age, String breed)
  {
	  name=name;//null
	  color=color;//null
	  cost=cost;//0
	  age=age;//0
	  breed=breed;//null
  }
	
	//common getter methods
   void getData()
   {
	   System.out.println("jerry");
	   System.out.println("brown");
	   System.out.println(6000);
	   System.out.println(2);
	   System.out.println("pug");
   }
   public class code2{
	public static void main(String[] args)
	{
		Dog1 d = new Dog1();
		d.setData("jerry","brown",6000,2,"pug");
		d.getData();

	}
   }
}
