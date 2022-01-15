package com.demo;

public class FinallyExc {
public static void main(String[] args) {
	int a=10;
	int b=20;
	try{
	int k=50/0;
	}finally {		//finally is java reserve word which we vl use to execute some code whether exception take place or not
					//no need to write the catch block
					//we can also write try, catch and finally
		int k=25;
	System.out.println(k);
}
}
}
