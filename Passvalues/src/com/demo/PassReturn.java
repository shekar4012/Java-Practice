package com.demo;

public class PassReturn {
	public int add(int x,int y) {
		int z=x+y;
		return z;
		
	}
public static void main(String[] args) {
	PassReturn obj=new PassReturn();
	int x=10;
	int y=50;
	int z=obj.add(x, y);
	System.out.println(z);
}
}
