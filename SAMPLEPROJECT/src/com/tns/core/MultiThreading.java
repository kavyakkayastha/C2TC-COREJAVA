package com.tns.core;

// (1) Java Thread Example by extending Thread class
/*
public class MultiThreading extends Thread 
{

	public void run()
	    {  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[])
	{  
		MultiThreading t1=new MultiThreading();  
		t1.start();  
	}  
		}
*/


// (2) Java Thread Example by implementing Runnable interface

/*
class MultiThreading implements Runnable
{  
public void run()
{  
System.out.println("thread is running...");  
}  
  
public static void main(String args[])
{  
MultiThreading m1=new MultiThreading();  
Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}  
*/


// (3)  Using the Thread Class: Thread(String Name)

/*
public class MultiThreading  
{  
// Main method  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread t= new Thread("My first thread");  
  
// the start() method moves the thread to the active state  
t.start();  
// getting the thread name by invoking the getName() method  
String str = t.getName();  
System.out.println(str);  
}  
}  
*/

// (4) Using the Thread Class: Thread(Runnable r, String name)

public class MultiThreading  implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object of the class MyThread2  
Runnable r1 = new MultiThreading();   
  
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread th1 = new Thread(r1, "My new thread");    
  
// the start() method moves the thread to the active state  
th1.start();   
  
// getting the thread name by invoking the getName() method  
String str = th1.getName();  
System.out.println(str);  
}    
}    