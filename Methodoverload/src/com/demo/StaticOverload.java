package com.demo;

public class StaticOverload {
	
	public static void add(String x, String y) { 
		String a=x+y;
		System.out.println(a);
	}
	
	public static void add(String x,String y,String z) { 
		String b=x+y+z;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		add("hello", "world"); //depending on inputs we assign method gets executed
		add("i", " am", " Indian");  
	}
}
