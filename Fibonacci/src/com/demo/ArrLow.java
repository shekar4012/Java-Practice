package com.demo;

public class ArrLow {
	public static void main(String[] args) {
		String s="qwefSDW sdffgFG fererer QEEWDSA asddfWWE sdfsdf";
		String arr[]=s.split(" ");   
		
		int count=0;   				//declaring count value
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
									//qwefSDW qwefSDW.qwefSDW (false)
									//sdffgFG sdffgFG.sdffgfg (false)
									//fererer fererer.fererer (true)
									//QEEWDSA QEEWDSA.qeewdsa (false)
									//asddfWWE asddfWWE.asddfwwe (false)
									//sdfsdf sdfsdf.sdfsdf (true)
			if(arr[i].toLowerCase().equals(arr[i])) {
			count++;  				//calling count value
			}
		}

		System.out.println(count);  //printing count
	}
	}

