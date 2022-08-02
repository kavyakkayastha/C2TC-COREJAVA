//Java program to demonstrate the working
//of throws keyword in exception handling
package com.tns.core;
/*import java.io.*;
import java.util.*;
*/
public class Throws 
{
	/*public static void writeToFile() throws Exception
    {
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("myFile.txt"));
        bw.write("Test");
        bw.close();
    }
   public static void main(String[] args) throws Exception
    {
        try {
            writeToFile();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }*/
	
public int division(int a, int b) throws ArithmeticException
{
    int t = a/b;
    return t;
 }
 public static void main(String args[])
 {
  Throws obj = new Throws();
   try
   {
       System.out.println(obj.division(15,0));
   }
    catch(ArithmeticException e)
   {
       System.out.println("You shouldn't divide number by zero");
   }
 }
}