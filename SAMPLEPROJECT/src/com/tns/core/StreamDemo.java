package com.tns.core;

//  (1)  Java Lambda Expression Example: Foreach Loop
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
public class StreamDemo 
{
public static void main(String[] args)
{
	List<Integer> l=List.of(10,12,13,45,32,0,56,78,98,34,67,31);
	System.out.println(l);

//conventional code
List<Integer> evenlist=new ArrayList<>();
for(Integer i:l) //foreach loop
{
	if(i%2==0)
	{
		evenlist.add(i);
	}
}
System.out.println(evenlist);
}
}
*/

/*
 //  (2) Java Lambda Expression Example: Filter Collection Data
 public class StreamDemo 
{
public static void main(String[] args)
{
	List<Integer> l=List.of(10,12,13,45,32,0,56,78,98,34,67,31);
	System.out.println(l);
	
	// Using stream API
	Stream<Integer> stream=l.stream();
	List<Integer> el= stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println();
}
}
*/

//  (3) Java Lambda Expression Example: map Collection Data

public class StreamDemo 
{
public static void main(String[] args)
{
	List<Integer> l=List.of(10,12,13,45,32,0,56,78,98,34,67,31);
	System.out.println(l);
	
	// Using stream API
	Stream<Integer> stream=l.stream();
	List<Integer> el= stream.map(i->i+10).collect(Collectors.toList());
	System.out.println(el);
}
}