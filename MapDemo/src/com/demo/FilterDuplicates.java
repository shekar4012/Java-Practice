package com.demo;
import java.util.TreeSet;
public class FilterDuplicates {
public static void main(String[] args) {
	
	 TreeSet<Character> ts = new TreeSet<Character>(); //Defining TreeSet
	 String s="bhjklpoiuymnbvcxdfgrewsaxxzqazxcvbnmghshjduyyter";
		String out="";
	 for(int i=0;i<s.length();i++) { 			  			  
				if(ts.add(s.charAt(i))==true) {   	
					out=out+s.charAt(i);
				}}
					System.out.println(out);
		} 
	} 
