package org.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T111 {
 public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get("https://www.toolsqa.com/automation-practice-table/");
	 List<WebElement>tRo = a.findElements(By.tagName("tr"));
	 for (int i = 0; i < tRo.size(); i++) {
		WebElement tRo1 = tRo.get(i);
		List<WebElement>tRo2 = tRo1.findElements(By.tagName("th"));
		for (int j = 0; j <tRo2.size(); j++) {
			WebElement tC = tRo2.get(j);
			String text = tC.getText();
			System.out.println(text);
		}
	}
}
}
