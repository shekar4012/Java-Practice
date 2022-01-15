package com.demo;

public class ThrowableError {

	public static void main(String[] args) {
		String A1="I am an Indian";
		String B2="Hello World";
		if (A1.equals(B2)) {
			System.out.println("Both are same");
		}else {
			throw new Error("Both are not matching");
		}
	}
}
