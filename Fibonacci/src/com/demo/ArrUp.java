package com.demo;

public class ArrUp {
	public static void main(String[] args) {
		String s="qwefSDW sdffgFG fererer QEEWDSA asddfWWE sdfsdf";
		String arr[]=s.split(" ");   
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
			if(arr[i].toLowerCase().equals(arr[i])) {
			count++;	
			}
		}
		System.out.println(count);
	}
	}

