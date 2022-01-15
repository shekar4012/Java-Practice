package com.demo;

public class ArrUpLow {
public static void main(String[] args) {
	String s="qwefSDW sdffgFG fererer QEEWDSA asddfWWE sdfsdf";
	String arr[]=s.split(" ");   
	
	int count=0;
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
					// qwefSDW QWEFSDW.qwefSDW (false) && qwefsdw.qwefSDW (false) = (false), F||F=F
					// sdffgFG SDFFGFG.sdffgFG (false) && sdffgfg.sdffgFG false = (false), F||F=F
					// fererer FERERER.fererer (false) && fererer.fererer (true) = (false), F||T=T  
					// QEEWDSA QEEWDSA.QEEWDSA (true) && qeewdsa.QEEWDSA (false) = (false), T||F=T  
					// asddfWWE ASDDFWWE.asddfWWE (false) && asddfwwe.asddfWWE (false) = (false), F||F=F
					// sdfsdf SDFSDF.sdfsdf (false) && sdfsdf.sdfsdf (true) = (false), F||T=T       

		if(arr[i].toUpperCase().equals(arr[i]) || arr[i].toLowerCase().equals(arr[i])) {	
		}else {
			count++;   //3
		}
	}
	System.out.println(count);
	}
}
