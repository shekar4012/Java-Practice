package com.demo;

public class ReturnPass {
	
	public String add (String a, String b) {
		System.out.println("hello");
		String c=a+b;
		return c;
	}
	public static void main(String[] args) {
		ReturnPass obj=new ReturnPass();
		String c=obj.add("hello", " world");
		System.out.println(c);	}
}
