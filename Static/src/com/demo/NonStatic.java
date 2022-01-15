package com.demo;

public class NonStatic {
public int add() {
	int x=10;
	int y=20;
	int z=x+y;
	
	return z;
	}

	public char getele() {
		char a='h';
		char b='w';
		char c=(char) (a+b);
		
		return c;
		}
	public static void main(String[] args) {
	NonStatic obj=new NonStatic();
	char c=obj.getele();
	System.out.println(c);
}
}
// why the output is ß ???