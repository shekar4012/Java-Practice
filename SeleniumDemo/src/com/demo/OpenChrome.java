package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{ 
public static void main(String[] args) 
{ 
// we have to set the .exe file path to open Google chrome 
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChromeDriver\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  System.out.println("tests");



} 
} 
