package org.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T114 {
 public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get("https://www.toolsqa.com/automation-practice-table/");
	  List<WebElement>tRo = a.findElements(By.tagName("tr"));
	  int n = tRo.size();
  for (int i = 2; i <=n-3 ; i++) {
	      WebElement w = tRo.get(i);
	          String text = w.getText();
	          System.out.println(text);
      }
   }
}
