package com.tns.core;
// (1) Examples of the join() Method
/*
class TestJoinMethod1 extends Thread{    
	 public void run(){    
	  for(int i=1;i<=5;i++)
	  {    
	   try{    
	    Thread.sleep(500);    
	   }catch(Exception e){System.out.println(e);}    
	  System.out.println(i);    
	  }    
	 }    
	public static void main(String args[]){    
	 TestJoinMethod1 t1=new TestJoinMethod1();    
	 TestJoinMethod1 t2=new TestJoinMethod1();    
	 TestJoinMethod1 t3=new TestJoinMethod1();    
	 t1.start();    
	 try{    
	  t1.join();    
	 }catch(Exception e){System.out.println(e);}    
	    
	 t2.start();                               //when t1 completes its task then t2 and t3 starts executing.
	 t3.start();    
	 }    
	}   
*/

// (2) join(long miliseconds) Method Example

class TestJoinMethod2 extends Thread
{    
	 public void run()
	 {    
	  for(int i=1;i<=5;i++)
	  {    
	   try
	   {    
	    Thread.sleep(500);    
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
		   }    
	  System.out.println(i);    
	  }    
	 }    
	public static void main(String args[]){    
	 TestJoinMethod2 t1=new TestJoinMethod2();    
	 TestJoinMethod2 t2=new TestJoinMethod2();    
	 TestJoinMethod2 t3=new TestJoinMethod2();    
	 t1.start();    
	 try
	 {    
	  t1.join(1500);    
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }    
	    
	 t2.start();    
	 t3.start();    
	 }    
	}    