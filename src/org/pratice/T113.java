package org.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T113 {
 public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get("https://www.toolsqa.com/automation-practice-table/");
	  List<WebElement>tRo = a.findElements(By.tagName("tr"));
	  System.out.println(tRo.size());
   for (int i = 4; i < tRo.size(); i++) {
	      WebElement w = tRo.get(i);
	          String text = w.getText();
	          System.out.println(text);
}
 
     }
}
