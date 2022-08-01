package com.tns.core;
//  (1) Example of the sleep() method in Java : on the custom thread
/*
class TestSleepMethod extends Thread
{    
	 public void run()
	 {    
	  for(int i=1;i<5;i++)
	  {   
	  // the thread will sleep for the 500 milli seconds   
	    try
	    {
	    	Thread.sleep(1000);
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    	}    
	    System.out.println(i);    
	  }    
	 }    
	 public static void main(String args[]){    
	  TestSleepMethod t1=new TestSleepMethod();    
	  TestSleepMethod t2=new TestSleepMethod();    
	     
	  t1.start();    
	  t2.start();    
	 }    
	}    
*/
  

// (2) Example of the sleep() Method in Java : on the main thread

/*
//important import statements  
import java.lang.Thread;  
import java.io.*;  

public class TestSleepMethod 
{  
 // main method  
public static void main(String argvs[])  
{  

try {  
for (int j = 0; j < 5; j++)  
{  

//The main thread sleeps for the 1000 milliseconds, which is 1 sec  
//whenever the loop runs  
Thread.sleep(1000);  

//displaying the value of the variable  
System.out.println(j);  
}  
}  
catch (Exception expn)   
{  
//catching the exception  
System.out.println(expn);  
}  
}  
}  
*/


// (3) Example of the sleep() Method in Java: When the sleeping time is -ive

//important import statements  
import java.lang.Thread;  
//import java.io.*;  

public class TestSleepMethod  
{  
//main method  
public static void main(String argvs[])  
{  
//we can also use throws keyword followed by  
//exception name for throwing the exception  
try   
{  
for (int j = 0; j < 5; j++)   
{  

//it throws the exception IllegalArgumentException  
//as the time is -ive which is -100  
Thread.sleep(-100);  

//displaying the variable's value  
System.out.println(j);  
}  
}  
catch (Exception expn)   
{  

//the exception is caught here   
System.out.println(expn);  
}  
}  
}  