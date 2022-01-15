package com.demo;

import java.util.LinkedList;

public class Demo {
public static void main(String[] args) {
	LinkedList<String> Raja=new LinkedList<String>();

	Raja.add("Name");
	Raja.add("Class");
	Raja.add("Roll No");
	System.out.println(Raja.getFirst()); // getFirst is used to print the First element in the LinkedList
	
	Raja.add("Name");
	Raja.add("Class");
	Raja.add("Roll No");
	System.out.println(Raja.getLast());  // getLast is used to print the Last element in the LinkedList

	Raja.add("Name");
	Raja.add("Class");
	Raja.add("Roll No");
	System.out.println(Raja.get(1));    // get the element using index integer from the LinkedList
	
	LinkedList<String> Nanu=new LinkedList<>();
	Nanu.add("Name");
	Nanu.add("Class");
	Nanu.add("Roll No");
	Nanu.addFirst("Surname");  // addFirst is used for adding a new element in the first of all elements present in LinkedList
	Nanu.addLast("Marks");     // addLast is used for adding a new element in the last of all elements present in LinkedList
	System.out.println(Nanu);	
	
	
	LinkedList<Integer> Cherry=new LinkedList<>();
	Cherry.add(10);
	Cherry.add(20);
	Cherry.add(30);
	Cherry.removeFirst();	//removeFirst is used to remove first element in the LinkedList
	System.out.println(Cherry); 
	
	LinkedList <Integer> Cherry1=new LinkedList<>();
	Cherry1.add(10);
	Cherry1.add(20);
	Cherry1.add(30);
	Cherry1.removeLast();    //removeLast is used to remove last element in the LinkedList
	System.out.println(Cherry1);
}
}
