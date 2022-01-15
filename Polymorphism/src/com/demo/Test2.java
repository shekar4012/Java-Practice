package com.demo;

public class Test2 extends Test1{
	void aadhar(String numbers) {
		System.out.println("name");
		System.out.println("father name");
		System.out.println("dob");
		System.out.println("phone");
		System.out.println("email");
		System.out.println("address");
	}
	public static void main(String[] args) {
		Test2 obj=new Test2();
		obj.aadhar("123456");
	}
}
