package com.demo;

import java.util.ArrayList;

public class ArrDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(40);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.contains(1));	
		
		for(int i=0;i<al.size();i++) { 			  // 0; 5; 0 1 2 3 4 5		
			for(int j=i+1;j<al.size();j++) {	  // 1 2 3 4 5
				if(al.get(i)==al.get(j)) {   	  // Compares to find duplicates  
					System.out.println("duplicate "+al.get(i));
				}
			}
		}		
	}
}

