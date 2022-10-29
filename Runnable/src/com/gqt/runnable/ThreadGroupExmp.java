//THREAD-GROUP
// A thread group is a collection of multiple threads sometimes 
//it can even contain another thread group also
package com.gqt.runnable;

public class ThreadGroupExmp implements Runnable {
   
	public void run()
	{
System.out.println("The Thread that is executing is:"+ Thread.currentThread().getName());
		
	}
}
class LaunchGroups{
   public static void main(String[] args) {
	ThreadGroupExmp tgx = new ThreadGroupExmp();
	ThreadGroup tg = new ThreadGroup("Example");

	Thread t1 = new Thread(tg,tgx,"Thread-1");
	Thread t2 = new Thread(tg,tgx,"Thread-2");
	Thread t3 = new Thread(tg,tgx,"Thread-3");

	t1.start();
	t2.start();
	t3.start();
	
	tg.list();
		
	}

}
