package com.tns.javabasicprograms;
//java program to reverse a word

/*
 import java.io.*;
 import java.util.Scanner;

public class ReverseStringExample 
{
public static void main (String[] args) 
{
        
   String str= "Geeks", nstr="";
   char ch;
        
   System.out.print("Original word: ");
   System.out.println("Geeks"); //Example word
        
   for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
*/

//Java program to ReverseString using ByteArray.

import java.lang.*;
import java.io.*;
import java.util.*;
  
// (2) Class of ReverseString
class ReverseStringExample 
{
    public static void main(String[] args)
    {
        String input = "GeeksforGeeks";
  
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
  
        byte[] result = new byte[strAsByteArray.length];
  
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
  
        System.out.println(new String(result));
    }
}