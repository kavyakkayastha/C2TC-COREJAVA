package com.tns.core;
//What if we call Java run() method directly instead start() method?
/*
public class TestCallRun {

	public void run()
	{  
		   System.out.println("running...");  
    }  
		 public static void main(String args[])
		 {  
		  TestCallRun t1=new TestCallRun();  
		  t1.run();//fine, but does not start a separate call stack  
		 }  

}
*/


class TestCallRun extends Thread
{  
	 public void run()
	 {  
	  for(int i=1;i<5;i++)
	  {  
	    try
	    {
	    	Thread.sleep(500);
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    	}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[])
	 {  
	  TestCallRun t1=new TestCallRun();  
	  TestCallRun t2=new TestCallRun();  
	   
	  t1.run();  
	  t2.run();  
	 }  
}  