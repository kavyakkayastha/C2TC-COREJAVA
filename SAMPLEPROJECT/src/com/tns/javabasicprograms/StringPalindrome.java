package com.tns.javabasicprograms;

public class StringPalindrome 
{
	public static void main(String args[]) 
  {
	      String myString = "anna";  //It is the string variable to be checked for palindrome 
	      StringBuffer buffer = new StringBuffer(myString); //Convert the StringBuffer object to Sting using the toString() method.
	      buffer.reverse();        //StringBuffer provides a method
	      String data = buffer.toString(); //Convert the StringBuffer object to Sting using the toString() method.
	      if(myString.equals(data))
	      {
	         System.out.println("Given String is palindrome");
	      } 
	      else
	      { 
	         System.out.println("Given String is not palindrome");
	      }
   }
}
