package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class SliderRangeTTK {
	
	@Test
	
	public void sliderRangeTTK() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmakn\\eclipse-workspace\\com.selenium2022\\driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com/home/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("Abc321@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abc1234");
		driver.findElement(By.className("my-login")).click();
		
		driver.findElement(By.linkText("Range Slider")).click();
		////*[@id="sidebar-wrapper"]/div[2]/a[8]
		
		
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/input[1]"));
		WebElement customSlider =driver.findElement(By.xpath("//*[@id=\"myRange\"]"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 10, 0).build().perform();
		act.dragAndDropBy(customSlider, 70, 0).build().perform();

	}
}
