package com.demo;

public class DemoAnd {
public static void main(String[] args) {
	int x=10;
	int y=20;
	int z=30;
	if (x>y && y>z) {
		System.out.println("welcome");
	}
	else if (y<x && z>x) {
		System.out.println("hello world");
	}
	//else if (y<z && y>x) {
		//System.out.println("namastee");
	//	}
	else {
		System.out.println("condition not satisfied");
	}
	}
}

