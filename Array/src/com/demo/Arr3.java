package com.demo;

import java.util.Arrays;

public class Arr3 {
	public static void main(String[] args) {
		Integer [] arr = { 1, 2, 5, 10, 1, 12, 13, 14, 4, 3 };
		
		Arrays.sort(arr);
		System.out.println("Array elements in ascending order: " + Arrays.toString(arr));
}
}


//long process:

/*int temp = 0;
for (int i = 0; i < arr.length; i++) {     
    for (int j = i+1; j < arr.length; j++) {     
       if(arr[i] > arr[j]) {    
           temp = arr[i];    
           arr[i] = arr[j];    
           arr[j] = temp;    
       }     
    }     
}
System.out.println("Elements sorted in ascending order: ");
for (int i = 0; i < arr.length; i++) {     
System.out.print(
	arr[i] + " ");    
}    */
  
