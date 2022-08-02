package com.tns.core;

// 1)  simple example of java multi-catch block.
/*
public class MultipleCatchBlock 
{  
		  
	    public static void main(String[] args)
	    {  
	          
	           try
	           {    
	                int a[]=new int[5];    
	                a[5]=30/0;    
	           }    
	               catch(ArithmeticException e)  
	           		{  
	                   System.out.println("Arithmetic Exception occurs");  
	                  }    
	               catch(ArrayIndexOutOfBoundsException e)  
	                  {  
	                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	                  }    
	               catch(Exception e)  
	                  {  
	                   System.out.println("Parent Exception occurs");  
	                  }             
	               System.out.println("rest of the code");    
	    }  
	  
	}
*/

// 2)  Secound simple example of java multi-catch block.

/*
public class MultipleCatchBlock 
{  
	      public static void main(String[] args) 
	      {  
          
           try
           {    
                int a[]=new int[5];    
                
                System.out.println(a[10]);  
           }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  
*/

// 3) third simple example of java multi-catch block.
/*
public class MultipleCatchBlock 
{  
	  
  public static void main(String[] args)  
  {  
          //try block contains two exceptions But at a time only one exception occurs and its corresponding catch block is executed.
           try
           {    
                int a[]=new int[5];    
                a[5]=30/0;    
                System.out.println(a[10]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  
*/


// 4) In this example, we generate NullPointerException, but didn't provide the corresponding exception type. 
//                     In such case, the catch block containing the parent exception class Exception will invoked.

/*
public class MultipleCatchBlock {  
	  
    public static void main(String[] args) {  
          
           try
           {    
                String s=null;  
                System.out.println(s.length());  
           }    
               catch(ArithmeticException e)  
           {  
                   System.out.println("Arithmetic Exception occurs");  
           }    
               catch(ArrayIndexOutOfBoundsException e)  
           {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
} 
*/


// 5)  Let's see an example, to handle the exception without maintaining the order of exceptions (i.e. from most specific to most general).

class MultipleCatchBlock
{    
	  public static void main(String args[]){    
	   try
	   {    
	    int a[]=new int[5];    
	    a[5]=30/0;    
	   }    
	   catch(Exception e)
	   {
		   System.out.println("common task completed");
	   }    
	   catch(ArithmeticException e)
	   { 
		   System.out.println("task1 is completed");
	   }    
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("task 2 completed");
	   }    
	   System.out.println("rest of the code...");    
	 }    
	}   