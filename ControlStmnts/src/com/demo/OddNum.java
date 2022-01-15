package com.demo;

public class OddNum {
	
public static void main(String[] args) {

	String s = "helloqwerty";
	String out = "";
	for (int i = 0; i < s.length(); i++) {
		if (i%2!=0) {	//hence odd number is not divided by 2 here we use for divide(%) and for not(!=) to retrieve even elements from the string
			out = out + s.charAt(i);
		}
	}
	System.out.println(out);
}
}

