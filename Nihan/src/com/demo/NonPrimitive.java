package com.demo;

public class NonPrimitive {
	public static void main(String[] args) {
		String s="hello";
		String s1=new String("hello");
		System.out.println(s==s1);
	}

{
	//Doubt : Why the result is not true although both values of different variables are same
	String s="10";
	String s1="10";
	System.out.println(s==s1);
	//
}
}
