package com.demo;

public class Return {
public int add() {
	int x=10;
	int y=20;
	int z=x+y;
	return z;
}
public static void main(String[] args) {
	Return obj=new Return();
	int a=10;
	int z=obj.add();
	System.out.println(a+z);
}
}
