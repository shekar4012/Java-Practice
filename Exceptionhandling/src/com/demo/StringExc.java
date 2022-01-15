package com.demo;

import java.lang.invoke.StringConcatException;

public class StringExc {
public static void main(String[] args) {
	
	try {
		String s="vamshi krishna";
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(20));
	}catch (ArithmeticException ae) {
	System.out.println("arthematic exception  :::" +ae);
	}catch (StringIndexOutOfBoundsException sibobe) {
	System.out.println("string inbond outbond exception  :::" +sibobe);
	}catch (Exception e) {
	System.out.println("Exception :::" +e);
	}
}
}
