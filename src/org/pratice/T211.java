package org.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T211 {
public static void main(String[] args) {
    WebDriver     a= T21.bro();
  a .get("https://www.facebook.com/");
 WebElement  txtN=a.findElement(By.id("email"));
  txtN.sendKeys("pavi@mhy");
  WebElement txP = a.findElement(By.id("pass"));
	   txP.sendKeys("43655467");
     }
}
