package com.demo;

import java.util.Arrays;

public class Demo12 {
public static void main(String[] args) {
	Integer[] array = { 45,56,89,77,33,25,18,9,9 };
	Arrays.sort(array);
	//Arrays.sort( array, Collections.reverseOrder());
	System.out.println("Array elements in ascending order: " + Arrays.toString(array));
	//System.out.println("Array elements in descending order: " + Arrays.toString(array));
}
}
