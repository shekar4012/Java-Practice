package com.demo;

class FiboDemo {

	public static void main(String[] args) {
		int [] arr= {2,3,5,10,11,15,20,22,42,50,55,105};
		
		for(int i=2; i<arr.length; i++) {
		
			if(arr[i]==arr[i-1]+arr[i-2]) {
			
				System.out.println(i-2 +" "+i);
			}
		}
	}
	}


