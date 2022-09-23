package com.cg.abstract_example;

abstract class Animals {

	abstract void hunt();
	abstract void eat();
	void rest() {
		System.out.println("It rests");
	}
}
//--------child class-1------------------------------------------
class tiger extends Animals{
	@Override   //override methods from the parent class
	void hunt() {
		System.out.println("tiger hunts");
	}
	
	@Override  
	void eat() {
		System.out.println("tiger eats");
	}
	
	void eatsdeer() {
		System.out.println("tiger eats deers");
	}
	}
//----------child class-2---------------------------------------------
class lion extends Animals{
	@Override   //override methods from the parent class
	void hunt() {
		System.out.println("lion hunts");
	}
	@Override 
	void eat() {
		System.out.println("lion eats");
	}

	void eatsbuffalo() {
		System.out.println("tiger eats buffalo");
	}
}
//----------------------child class-3----------------------------------
class werewolf extends Animals{
	@Override   //override methods from the parent class
	void hunt() {
		System.out.println("werewolf hunts");
	}
	@Override   
	void eat() {
		System.out.println("werewolf eats");
	}

	void eatsrabbit() {
		System.out.println("werewolf rabbits");
	}
}
class Forest{
	void permit(Animals a) {
	a.hunt();//from the parent class
	a.eat();//from the child class
	a.rest();//from the parent class
	}
}
 class program_2{
	
	public static void main(String[] args) {
		tiger tg = new tiger();
		lion ln = new lion();
		werewolf ww = new werewolf();
		
		Animals a = new Animals() {
			@Override
			void hunt() {
				//-----hunt
			}
			@Override
			void eat() {
				//----eat
			}
		};
		Forest f = new Forest();
		
		System.out.println("------------Tiger----------");
		f.permit(tg);
		tg.eat();// from the child class
		
		System.out.println("------------Lion----------");
		f.permit(ln);
		ln.eat();// from the child class
		
		
		System.out.println("-----------werewolf-----------");
		f.permit(ww);
		ww.eat();// from the child class
		
		
		
	}

}
