package com.demo;

public class StringFunctions {

	public static void main(String[] args) {
		String R1="Welcome to Java Selenium";
		String R2="Welcome to Phython Selenium";
		String R3="welcome to java selenium";
		String R4=" Welcome to Java ";
		System.out.println(R1.charAt(12));				//to find char at on String
		System.out.println(R1.contains("Java"));		//to check whether it contains or not
		System.out.println(R1.equals(R2));				//to compare
		System.out.println(R1.equalsIgnoreCase(R3));	//to ignore case sensitive whilw comparing
		System.out.println(R1.concat(R2));			//to concat two Strings
		System.out.println(R2.indexOf('P'));		//index of char
		System.out.println(R2.indexOf("Selenium"));	//index of String
		System.out.println(R3.isEmpty());			//to know whether empty or not
		System.out.println(R3.lastIndexOf("e"));		//find index of last ' ' in string
		System.out.println(R3.length());				//to know the length of the String
		System.out.println(R2.replace('P', 'S'));		//to replace a character
		System.out.println(R2.replaceFirst("W", "M"));	//replace first character of string
		System.out.println(R3.replaceAll(" ", ","));	//replacing regex
		System.out.println(R3.startsWith("w"));			//to find char starts with or not
		System.out.println(R3.replace("selenium", "Katalon"));		//replace
		System.out.println(R2.toLowerCase());		//convert to Lower case
		System.out.println(R3.toUpperCase());		//convert to Upper case
		String r[]=R1.split(" ");					//Split String
		for(int i=0;i<r.length;i++){
		System.out.println(r[i]);
		}
		System.out.println("-----------");
		System.out.println(R4.trim());				//trim 
		System.out.println(R4.substring(12));
	}

}
