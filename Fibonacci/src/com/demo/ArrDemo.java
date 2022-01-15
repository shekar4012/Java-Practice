package com.demo;

public class ArrDemo {
	public static void main(String[] args) {
		String s="fghkl dfeohkle frfefhk klerfd fghjkl";
		String arr[]=s.split(" ");   
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].startsWith("f")) {

				System.out.println(arr[i]);
				}
		}
	}}
