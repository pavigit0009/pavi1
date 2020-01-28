package org.pratice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T24 {
 public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get("https://netbanking.hdfcbank.com/netbanking/");
	  a.switchTo().frame("login_page");
	 WebElement  txtN=a.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	  txtN.sendKeys("pavi2345");
	  WebElement t = a.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	  t.click();
	  //Alert b=a.switchTo().alert();
	  //b.accept();
}
}
