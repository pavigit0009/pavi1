package org.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T21 {
	
	public static WebDriver bro() {
		System.setProperty("webdriver.chrome.driver", "E:\\javasel\\pavidon\\driver\\chromedriver.exe");
         WebDriver emp=new ChromeDriver();
		 return emp; 
	}
}
