package com.demo;

public class SplitExmpl {
		public static void main(String args[]){
		String s1="welcome to split world";
		for(String w:s1.split("\\s",0)){
		System.out.println(w);
		}
		for(String w:s1.split("\\s",1)){
		System.out.println(w);
		}
		for(String w:s1.split("\\s",2)){
		System.out.println(w);
		}
		for(String w:s1.split("\\s",3)){
		System.out.println(w);
		}
		}
}
