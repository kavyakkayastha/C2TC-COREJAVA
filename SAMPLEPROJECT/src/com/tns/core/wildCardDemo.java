package com.tns.core;
import java.util.Arrays;
import java.util.List;

// generic method - sorting the arraylist
public class wildCardDemo
{
public static void main(String[] args)
{
	List<Integer> list1=Arrays.asList(14,45,78,63,89);   //integer datatype
	
	List<Double> list2= Arrays.asList(2.3,5.6,8.9,7.5);   // float datatype
	
	printList(list1);
	
	printList(list2);
}
public static void printList(List<?> list)
{
	System.out.println(list);                   //print the both list 
}

}
