package com.gqt.producerconsumer;

 class Producer extends Thread
 {
	 Queues a;
	 public Producer(Queues q)
	 {
		 a = q;
	 }
  public void run() {
	  int i = 0;
	  while(true)
	  {
		  a.put(i++);
	  }
  }
}
class Queues
{
	int x;
	public void put(int i) {
		x = i;
		System.out.println(" I have added the value"+i+"into x.");
	}
	public void get() {
		System.out.println("I have fetched the value"+x+"from x.");
	}
}
 class Consumer extends Thread
 {
	 Queues b;
	 public Consumer(Queues q)
	 {
		 b = q;
	 }
	 public void run() {
		 while(true)
		 {
			 b.get();
		 }
	 }
 }
 class LaunchProdCust1{
	public static void main (String[] args) {
		Queues q = new Queues();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();
		
	}
}
