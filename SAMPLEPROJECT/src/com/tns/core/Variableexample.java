package com.tns.core;

// public class Variableexample 

//{
//
//  static int m=100;//static variable  - can create a single copy of the static variable and share it among all the instances of the class. 
//                                        Memory allocation for static variables happens only once when the class is loaded in the memory.
//	    void method()  
//    {    
//      int n=90;//local variable -  declared inside the body of the method is called local variable.
//                                   You can use this variable only within that method and 
//                                   the other methods in the class aren't even aware that the variable exists.
//    }  
//   public static void main(String args[])  
//    {  
//   int data=50;//instance variable -  declared inside the class but outside the body of the method
//                                      It is called an instance variable because its value is instance-specific and is not shared among instances.
//    }  
// }

// 1) Java Variable Example : Add Two Numbers

/*
public class Variableexample
{    
public static void main(String[] args)
{    
int a=10;    
int b=10;    
int c=a+b;    
System.out.println(c);    
}  
}    
*/

// 2) Java Variable Example : Widening

/*
public class Variableexample
{  
public static void main(String[] args)
{  
int a=10;  
float f=a;  
System.out.println(a);  
System.out.println(f);  
}
}  
*/

// 3) Java Variable Example : Narrowing (Typecasting)

/*
public class Variableexample
{  
public static void main(String[] args)
{  
float f=10.5f;  
//int a=f;//Compile time error  
int a=(int)f;  
System.out.println(f);  
System.out.println(a);  
}
}  
*/


// 4) Java Variable Example: Overflow

/*
class Variableexample
{  
public static void main(String[] args)
{  
//Overflow  
int a=130;  
byte b=(byte)a;  
System.out.println(a);  
System.out.println(b);  
}
}  
*/

// 5) Java Variable Example: Adding Lower Type

class Variableexample
{  
public static void main(String[] args)
{  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}
}  