package com.demo;

import java.nio.file.FileSystemNotFoundException;

public class MulExcp {
	public static void main(String[] args) {
		
	int a=5;
	int b=10;
	try{ 
		int c=15/0;
	}catch (FileSystemNotFoundException fsnfe) {
		System.out.println("file not found error ::: "+fsnfe );
	}catch (ArithmeticException ae) {
		System.out.println("arthmtic error ::: "+ae);
	}catch (Exception e) {
		System.out.println(e);
	}
	int d=a+b;
	System.out.println(d);

	}
}
