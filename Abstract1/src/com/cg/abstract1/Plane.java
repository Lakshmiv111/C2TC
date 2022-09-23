package com.cg.abstract1;

abstract class Plane
{
	abstract void takeOff();
	abstract void fly();
	void land()
	{
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	
@Override
void takeOff()
{
	System.out.println("Cargo Plane took off");
}

@Override
void fly() {
	System.out.println("Cargo Plane fly at lower heights");
}

void CarryGoods() {
	System.out.println("Cargo Plane Carry goods");
}
}
 class PassengerPlane extends Plane{

	 void takeOff()
	 {
	 	System.out.println("PassengerPlane Plane took off");
	 }

@Override
void fly() {
	System.out.println("Passenger Plane fly at medium heights");
}

void carryPassengers() {
	System.out.println("Passenger Plane carry Passengers");
}
}
 
class FighterPlane extends Plane{
	@Override
	void takeOff()
	{
		System.out.println("Fighter Plane took off");
	}
	@Override
	void fly()
	{
		System.out.println("Fighter Plane fly at greater heights");
	}

void carryWeapons() {
	System.out.println("Fighter Plane carry Weapons");
}
}
class Airport
{
	void permit(Plane p)
	{
		p.takeOff();//from the parent class
		p.fly(); //from the child class
		p.land(); //from the parent class
	}
}
  class Launch{
	public static void main(String[] args) {
	  CargoPlane cp = new 	CargoPlane();
	  PassengerPlane pp = new PassengerPlane();
	  FighterPlane fp = new FighterPlane();
	  
	 // Plane p = new Plane();// error cannot create object of abstract class
//creating the object of abstract class using anonymous inner types	  
	  Plane p = new Plane() {
		  @Override
		  void takeOff() {
			 //-----
		  }
		  @Override
		  void fly() {
			 //-----
		  }
	  };
	  Airport a = new Airport();
	  
	  System.out.println("-------Cargo Plane------");
	  a.permit(cp);
	  cp.CarryGoods();//from the child class
	  
	  System.out.println("-------Passenger Plane------");
	  a.permit(pp);
	  pp.carryPassengers();//from the child class
	  
	  System.out.println("-------Fighter Plane------");
	  a.permit(fp);
	  fp.carryWeapons();//from the child class
	  

	}

}
