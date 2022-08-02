package com.tns.core;

//  1)  Java Unary Operator Example: ++ and --
/*
public class OperatorExample
{  
	public static void main(String args[])
	{  
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		}
} 
*/ 

//   2)  Java Unary Operator Example 2: ++ and --

/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=10;  
System.out.println(a++ + ++a);//10+12=22  
System.out.println(b++ + b++);//10+11=21  
  }
}  
*/

// 3) Java Unary Operator Example: ~ and !

/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  
}
} 
*/

// 4) Java Arithmetic Operator Example - perform addition, subtraction, multiplication, and division. They act as basic mathematical operations.

/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=5;  
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0  
}
}  
*/


// 5) Java Arithmetic Operator Example: Expression

/*
public class OperatorExample
{  
public static void main(String args[])
{  
System.out.println(10*10/5+3-1*4/2);  
}
}  
*/


// 6) Java Left Shift Operator <<  IT is used to shift all of the bits in a value to the left side of a specified number of times.

/*
public class OperatorExample
{  
public static void main(String args[])
{  
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  
}
}  
*/

// 7) The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.

/*
public class OperatorExample
{  
public static void main(String args[])
{  
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
}
}
*/

// 8) Java Shift Operator Example: >> vs >>>

/*
public class OperatorExample
{  
public static void main(String args[])
{  
    //For positive number, >> and >>> works same  
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  
    System.out.println(-20>>>2);  
}
}  
*/

// 9) Java AND Operator Example(i): Logical && -The logical && operator doesn't check the second condition if the first condition is false. 
//                                           It checks the second condition only if the first one is true.
//                               bitwise & - The bitwise & operator always checks both conditions whether first condition is true or false.


/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a<c);//false && true = false  
System.out.println(a<b&a<c);//false & true = false  
}
}  
*/


//  10) Java AND Operator Example(ii): Logical && vs Bitwise &

/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a);//11 because second condition is checked  
}
}  
*/

// 11) Java OR Operator Example: Logical || -The logical || operator doesn't check the second condition if the first condition is true.
//                                           It checks the second condition only if the first one is false.
//                               Bitwise |  -The bitwise | operator always checks both conditions whether first condition is true or false.


/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
}
}  
*/

// 12) Java Ternary Operator - is used as one line replacement for if-then-else statement and used a lot in Java programming. 
//                             It is the only conditional operator which takes three operands.

/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=2;  
int b=5;  
int min=(a<b)?a:b;  
System.out.println(min);  
}
}  
*/


// 13)(i) Java Assignment Operator -is one of the most common operators. It is used to assign the value on its right to the operand on its left.
/*
public class OperatorExample
{  
public static void main(String args[])
{  
int a=10;  
int b=20;  
a+=4;//a=a+4 (a=10+4)  
b-=4;//b=b-4 (b=20-4)  
System.out.println(a);  
System.out.println(b);  
}
}  
*/
// 14)(i) - Java Assignment Operator
/*
public class OperatorExample
{  
public static void main(String[] args)
{  
int a=10;  
a+=3;//10+3  
System.out.println(a);  
a-=4;//13-4  
System.out.println(a);  
a*=2;//9*2  
System.out.println(a);  
a/=2;//18/2  
System.out.println(a);  
}
}  
*/

// 15) Java Assignment Operator Example: Adding short
/*
public class OperatorExample
{  
public static void main(String args[]){  
short a=10;  
short b=10;  
//a+=b;//a=a+b internally so fine  
a=a+b;//Compile time error because 10+10=20 now int  
System.out.println(a);  
}
}
*/

// After type cast:

public class OperatorExample
{  
public static void main(String args[]) 
{  
short a=10;  
short b=10;  
a=(short)(a+b);//20 which is int now converted to short  
System.out.println(a);  
}
}  