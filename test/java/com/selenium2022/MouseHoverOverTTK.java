package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverOverTTK {
	
@Test
	
	public void MouseHover(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmakn\\eclipse-workspace\\com.selenium2022\\driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.taltektc.com/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("email")).sendKeys("Abc321@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abc1234");
		driver.findElement(By.className("my-login")).click();
		
		driver.findElement(By.linkText("Mouse Hover Over")).click();

		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/button"));
			
		Actions act = new Actions(driver);
		//act.moveToElement(mouse).build().perform(); //mouse hover over on Dropdown
		act.moveToElement(mouse).moveToElement(driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/a[2]"))).click().build().perform();
		//click on Link 2
	}
}
