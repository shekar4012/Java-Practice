package com.demo;

public class SwitchDemo {

	public static void main(String[] args) {
		int marks=50;
		switch(marks){
			case 75: System.out.println("passed in first class");
				break;
			case 50:
				System.out.println("passed in second class");
				break;
			case 35:
				System.out.println("passed in third class");
				break;
			default:
				System.out.println("failed");
		}

	}

}
