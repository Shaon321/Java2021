package com.selenium2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByVisibleElements {
	@Test

	public void visibleElement() {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");
    
        driver.manage().window().maximize();

        //Find element by link text and store in variable "element"        		
    
        //WebElement element = driver.findElement(By.linkText("Linux"));
   
        WebElement element = driver.findElement(By.linkText("Jobs"));
    
        //js.executeScript("arguments[0].scrollIntoView();", element);
        
        // scrollIntoView() method: Where an ” element ” is the locator on the web page.
        //js.executeScript("arguments[0].scrollIntoView();", element);
        	        
        // This  will scroll down the page by 1000 pixel vertical		
        //js.executeScript("window.scrollBy(0,5000)");
        
       
        //This will scroll the web page till end.		
         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


         //Again scroll up
         JavascriptExecutor jp = (JavascriptExecutor) driver;
	        
         WebElement element1 = driver.findElement(By.linkText("Quiz"));
         jp.executeScript("arguments[0].scrollIntoView();", element1);

	}
}