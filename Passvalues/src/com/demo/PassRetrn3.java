package com.demo;

public class PassRetrn3 {
		public char add(char a, char b) {
		char c=(char) (a+b);
		return c;
	}
	public static void main(String[] args) {
		PassRetrn3 obj=new PassRetrn3();
		char a='h';
		char b='d';
		char c=obj.add(a, b);
		System.out.println(c);
	}
}
