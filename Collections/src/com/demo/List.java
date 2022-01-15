package com.demo;

import java.util.ArrayList;

	public class List {
	public static void main(String[] args) {
		
	ArrayList<Integer> al=new ArrayList<Integer>(); //Non-Generic
	al.add(10);
	al.add(100);
	System.out.println(al);

	ArrayList as=new ArrayList(); //Non-Generic
	as.add("hello");
	as.add("world");
	System.out.println(as);

	al.addAll(as); //addAll is used to add the values of different methods
	
	System.out.println(al);
	
	ArrayList<String> als=new ArrayList<String>(); //Generic
	als.add("nandana");
	System.out.println(als);
	}
}
