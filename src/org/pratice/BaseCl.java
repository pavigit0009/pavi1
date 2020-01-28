package org.pratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseCl {
	static  WebDriver driver;
    public static void   lanchBroswer(){ 
    	System.setProperty("webdriver.chrome.driver", "E:\\javasel\\pavidon\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
		
	}
    public static void loadUrl(String url) {
    	driver.get(url);
    }
    public static void getTitle() {
    	String title = driver.getTitle();
    	System.out.println(title);
    }
    public static void getCurrentUrl() {
    	String currentUrl = driver.getCurrentUrl();
    	System.out.println(currentUrl);
    }
    public static void fill(WebElement e,String value) {
    	e.sendKeys(value);
      }
    public static void sBi(WebElement e,int i) {
    	Select s=new Select(e);
    	s.selectByIndex(i);
    }
    public static void btnBu(WebElement e) {
    	e.click();
    }
    public static void quI() {
    	driver.quit();
    }
    public static void  al() {
    	Alert a=driver.switchTo().alert();
    	a.accept();
    }
    public static void al2() {
    	Alert a=driver.switchTo().alert();
    	a.dismiss();
      }
    public static void al3(String s) {
    	Alert a=driver.switchTo().alert();
    	a.sendKeys(s);
    	
    }
    public static void  ac() {
    	
    }
    }
       

