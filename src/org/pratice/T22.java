package org.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T22 {
public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get("https://www.redbus.in/");
	 WebElement  txtN=a.findElement(By.id("src"));
	  txtN.sendKeys("chennai");
	  WebElement txP = a.findElement(By.id("dest"));
		   txP.sendKeys("bangaluru");
  }
}
