package org.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T112 {
public static void main(String[] args) {
	 WebDriver     a= T21.bro();
	  a .get("https://www.toolsqa.com/automation-practice-table/");
	 List<WebElement>tRo = a.findElements(By.tagName("tr"));
	 List<WebElement> to2 = a.findElements(By.tagName("td"));
	 System.out.println("tr size"+tRo.size());
     System.out.println("td size"+to2.size());
	 for (int i = 1; i <to2.size(); i++) {
              for (int j = 1; j <to2.size(); j++) {
            	  
        	      if(j==1){
        	       WebElement w1 = to2.get(i);
    		       String text = w1.getText();
    		       System.out.print(text+" ");}
        	       if(j==4) { i=i+5;
        	       WebElement w2 = to2.get(i-j+3);
        	       String text2 = w2.getText();
        	       System.out.print(" "+text2);
        	       System.out.println();
        
                   }
	        	}		  
	        }
		 
	    }

}

