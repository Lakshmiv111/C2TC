 class Wrapper
 {
	 public static void main(String[] args) 
	 {
		 //boxing process using constructors
		 Integer obj1 = new Integer(123);
		 Integer obj2 = new Integer("123");
		 

		 //boxing process using valueOf () method
		 Integer obj3 = new Integer(128);
		 Integer obj4 = new Integer("129");
		 
		 System.out.println("---After boxing process---");
		 System.out.println("obj1="+obj1);
		 System.out.println("obj2="+obj2);
		 System.out.println("obj3="+obj3);
		 System.out.println("obj4="+obj4);
		
		 //un-boxing process:
		 
		 int a = obj1.intValue();
	    String s1 = obj2.toString()	;
	    int b= obj3.intValue();
	    String s2 = obj4.toString()	; 

		 System.out.println("---After unboxing process---");
		 System.out.println("a="+a);	 
		 System.out.println("s1="+s1);
		 System.out.println("b="+b);
		 System.out.println("s2="+s2);
	 }
 
}