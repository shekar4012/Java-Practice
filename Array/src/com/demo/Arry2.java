package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class Arry2 {
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 5, 10, 1, 12, 13, 14, 4, 3 };
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " + Arrays.toString(array));
	}
}
