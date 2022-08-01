package com.tns.javabasicprograms;
/*
public class PrimeExample 
{
	public static void main(String args[])
	{    
		  int i,m=0,flag=0;      
		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
	

}
*/
//Prime Number Program in Java (Another way)
//You can also use a method where number is not predefined. Here, user has to put the number to check if the number is prime.

/*
import java.util.Scanner;  
import java.util.Scanner;  
  
public class PrimeExample 
{  
  
   public static void main(String[] args)
   {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) 
       {  
           System.out.println(n + " is a prime number");  
       } 
       else 
       {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) 
   {  
       if (n <= 1) 
       {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) 
           {  
               return false;  
           }  
       }  
       return true;  
   }  
}  
*/

//Prime Number Program using Method in Java
public class PrimeExample
{    
static void checkPrime(int n)
{  
	  int i,m=0,flag=0;      
	  m=n/2;      
	  if(n==0||n==1)
	  {  
	   System.out.println(n+" is not prime number");      
	  }
	  else
	  {  
	   for(i=2;i<=m;i++)
	   {      
	    if(n%i==0)
	    {      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  
	   {
		   System.out.println(n+" is prime number"); 
	   }  
	  }//end of else  
	}  
	 public static void main(String args[]){    
	  checkPrime(1);  
	  checkPrime(3);  
	  checkPrime(17);  
	  checkPrime(20);  
	}    
	}   