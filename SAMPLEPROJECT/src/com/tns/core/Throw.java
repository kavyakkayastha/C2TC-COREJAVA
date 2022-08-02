// Java program to demonstrate the working 
// of throw keyword in exception handling
 package com.tns.core;

public class Throw
{
	/*{
        // Use of unchecked Exception
        try {
            // double x=3/0;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }*/
	public void checkAge(int age){
	      if(age<18)
	         throw new ArithmeticException("Not Eligible for voting");
	      else
	         System.out.println("Eligible for voting");
	   }
	   public static void main(String args[])
	   {
		   Throw obj = new Throw();
	      obj.checkAge(13);
	      System.out.println("End Of Program");
	   }
}
