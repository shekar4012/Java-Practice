package com.demo;

public class EvnNum {
public static void main(String[] args) {
	String s="helloqwerty";
	String out="";  //null variable
	for(int i=0; i<s.length(); i++) {
		if(i%2==0) { //hence even number is divided by 2 here we use % to retrieve even elements from the string
			//System.out.println(i);
			//System.out.println(s.charAt(i));
			out = out+s.charAt(i);
		}
	}
			System.out.println(out);
		}
	}
