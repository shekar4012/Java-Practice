package com.demo;

import java.util.HashSet;

public class HashSetString {

	public static void main(String[] args) {
		String s="welcome";
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++) { 
			System.out.println(s.charAt(i));
		
			if(hs.add(s.charAt(i))==false) {	//hs.add(w) //hs.add(e) //hs.add(l) //hs.add(c) //hs.add(o) //hs.add(m) *//hs.add(e)
				
		System.out.println(s.charAt(i));

	}
	}
	}
	}
