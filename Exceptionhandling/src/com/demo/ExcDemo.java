package com.demo;

class ExcDemo {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		try {						//keep the code inside
			int z=20/0;	
		} catch (Exception e) {		//catch the exception
			System.out.println(e);
		}
		
		int a=x+y;
		System.out.println(a);
		

	}

}
