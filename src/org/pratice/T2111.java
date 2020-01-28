package org.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2111 {
  public static void main(String[] args) {
	  WebDriver     a= T21.bro();
	  a .get("https://www.toolsqa.com/automation-practice-table/");
	 List<WebElement>tRo = a.findElements(By.tagName("tr"));
	 List<WebElement> to2 = a.findElements(By.tagName("td"));
	 System.out.println("tr size"+tRo.size());
     System.out.println("td size"+to2.size());
     for (int i = 1; i <tRo.size(); i++) {
         for (int j = 1; j <to2.size(); j++) {
                WebElement w = to2.get(i);
                	String text = w.getText();
                	System.out.println(text);
                
         }
   }
  }
}
