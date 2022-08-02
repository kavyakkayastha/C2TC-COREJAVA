package com.tns.core;
//Java Control Statements | Control Flow in Java
//(1) Decision-Making statements: 1)decide which statement to execute and when.
//                               2)evaluate the Boolean expression and control the program flow 
//                                 depending upon the result of the condition provided.
// (I) if statements :
//     (i)   simple if :  1)used to evaluate a condition
//                        2)The control of the program is diverted depending upon the specific condition.
//                        3)The condition of the If statement gives a Boolean value, either true or false.

/*
public class Student 
{

	public static void main(String[] args) {    
		int x = 10;    
		int y = 12;    
		if(x+y > 20) {    
		System.out.println("x + y is greater than 20");    
		}    
		}      
}
*/

//    (ii) if-else statement : 1)is an extension to the if-statement, which uses another block of code, i.e., else block. 
//                             2)The else block is executed if the condition of the if-block is evaluated as false.

/*
public class Student 
{  
public static void main(String[] args)
{  
int x = 10;  
int y = 12;  
if(x+y < 10)
{  
System.out.println("x + y is less than 10");  
}  
else
{  
System.out.println("x + y is greater than 20");  
}  
}  
}  
*/

//    (iii)  if-else-if ladder: 1) contains the if-statement followed by multiple else-if statements
//                              2) In other words, we can say that it is the chain of if-else statements that create a decision tree
//                                 where the program may enter in the block of code where the condition is true.
//                                 We can also define an else statement at the end of the chain.

/*
public class Student 
{  
public static void main(String[] args) 
{  
String city = "Delhi";  
if(city == "Meerut")
{  
System.out.println("city is meerut");  
}
else if (city == "Noida")
{  
System.out.println("city is noida");  
}
else if(city == "Agra") 
{  
System.out.println("city is agra");  
}
else
{  
System.out.println(city);  
}  
}  
}  
*/
//  (II)
//     (iv) Nested if-statement : the if statement can contain a if or if-else statement inside another if or else-if statement.

/*
public class Student 
{    
public static void main(String[] args) 
{    
String address = "Delhi, India";    
    
if(address.endsWith("India"))
  {    
if(address.contains("Meerut")) 
     {    
System.out.println("Your city is Meerut");    
     }
else if(address.contains("Noida"))
     {    
System.out.println("Your city is Noida");    
     }
else 
     {    
System.out.println(address.split(",")[0]);    
      }    
    }
else 
 {    
System.out.println("You are not living in India");    
 }    
}    
}    
*/

//  (II) Switch Statement: 1) contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.
//                         2) is easier to use instead of if-else-if statements. It also enhances the readability of the program.

/*
public class Student implements Cloneable
{  
public static void main(String[] args) 
{  
int num = 2;  
switch (num)
{  
case 0:  
       System.out.println("number is 0");  
 break;  
case 1:  
       System.out.println("number is 1");  
 break;  
default:  
       System.out.println(num);  
      }  
   }  
}  
*/
// (2) Loop Statements : 1) In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true.
//                                         However, loop statements are used to execute the set of instructions in a repeated order.
//                      2) The execution of the set of instructions depends upon a particular condition.
//          (I)Java for loop : It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. 

/*
public class Student //(Calculation) 
{  
public static void main(String[] args)
{  
// TODO Auto-generated method stub  
int sum = 0;  
for(int j = 1; j<=10; j++)
{  
sum = sum + j;  
}  
System.out.println("The sum of first 10 natural numbers is " + sum);  
}  
} 
*/
 
//          (II) Java for-each loop :Java provides an enhanced for loop to traverse the data structures like array or collection. 
//                                   In the for-each loop, we don't need to update the loop variable.

/*
public class Student //(Calculation)
{    
public static void main(String[] args)
{    
// TODO Auto-generated method stub    
String[] names = {"Java","C","C++","Python","JavaScript"};    
System.out.println("Printing the content of the array names:\n");    
for(String name:names)
{    
System.out.println(name);    
}    
}    
}  
*/
//           (III)Java while loop : 1)is also used to iterate over the number of statements multiple times.
//                                  2)if we don't know the number of iterations in advance, it is recommended to use a while loop. Unlike for loop.
//                                  3)the initialization and increment/decrement doesn't take place inside the loop statement in while loop.
//                                  4)It is also known as the entry-controlled loop since the condition is checked at the start of the loop.
//                                    If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed.
/*
public class Student //(Calculation) 
{    
public static void main(String[] args)
{    
// TODO Auto-generated method stub    
int i = 0;    
System.out.println("Printing the list of first 10 even numbers \n");    
while(i<=10) 
{    
System.out.println(i);    
i = i + 2;    
}    
}    
} 
*/   

//             (IV)Java do-while loop : 1)The do-while loop checks the condition at the end of the loop after executing the loop statements. 
//                                      2)When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.
//                                      3)It is also known as the exit-controlled loop since the condition is not checked in advance.

/*
public class Student //(Calculation)
{    
public static void main(String[] args) 
{    
// TODO Auto-generated method stub    
int i = 0;    
System.out.println("Printing the list of first 10 even numbers \n");    
do
{    
System.out.println(i);    
i = i + 2;    
}
while(i<=10);    
}    
}    
*/

//  (3) Jump Statements : 1)Jump statements are used to transfer the control of the program to the specific statements.
//                        2)In other words, jump statements transfer the execution control to the other part of the program.
//       (I)Java break statement : 1) the break statement is used to break the current flow of the program and
//                                    transfer the control to the next statement outside a loop or switch statement.
//                                 2)it breaks only the inner loop in the case of the nested loop.
//                                 3)The break statement cannot be used independently in the Java program,
//                                   i.e., it can only be written inside the loop or switch statement.
//            (i)The break statement example with for loop
/* 
public class Student//(BreakExample)
{  
	  
public static void main(String[] args)
{  
// TODO Auto-generated method stub  
for(int i = 0; i<= 10; i++) 
{  
System.out.println(i);  
if(i==6)
{  
break;  
}  
}  
}  
}  
*/
//          (ii)break statement example with labeled for loop
/*
public class Student //(Calculation)
{    
    public static void main(String[] args) 
    {    
// TODO Auto-generated method stub    
     a:    
for(int i = 0; i<= 10; i++) 
{    b:    
for(int j = 0; j<=15;j++)
{    c:    
for (int k = 0; k<=20; k++) 
{    
System.out.println(k);    
if(k==5) {    
break a;    
}    
}    
}        
}    
}        
}    
*/
//       (II)Java continue statement :    Unlike break statement, the continue statement doesn't break the loop, whereas,
//                                        it skips the specific part of the loop and jumps to the next iteration of the loop immediately.

public class Student//(ContinueExample) 
{  
	  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
  
for(int i = 0; i<= 2; i++) {  
  
for (int j = i; j<=5; j++) {  
  
if(j == 4) {  
continue;  
}  
System.out.println(j);  
}  
}  
}  
  }  
