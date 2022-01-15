package com.demo1;

public class AddPrac {
public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public void sub() {
	int d=40;
	int e=5;
	int f=d+e;
	System.out.println(f);;
}
public static void main(String[] args) {
	AddPrac obj=new AddPrac() ;
	obj.add();
	obj.sub();
}
}