package com.demo;

public class OverLoad {
	static int add(int a, int b) {  //used static keyword, so that creation of object is not necessary
									//used int as return type to return the value
		return a+b;
	}
	static double add(double a, double b) {  //used double as return type to return the value
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(OverLoad.add(10, 20));
		System.out.println(OverLoad.add(20.2, 10.5));
	}
}
