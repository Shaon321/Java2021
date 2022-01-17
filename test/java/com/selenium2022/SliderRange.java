package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderRange {

	@Test
	public void sliderRange() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmakn\\eclipse-workspace\\com.selenium2022\\driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(0);
		WebElement slider =driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 300, 0).build().perform();
		
		
		
	}	
}
