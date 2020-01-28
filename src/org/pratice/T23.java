package org.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T23 {
 public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get(" https://www.google.com/");
	 WebElement  txtN=a.findElement(By.id("//input[@type='url']"));
	  txtN.sendKeys("GreensTechnology.com");
	
}
}
