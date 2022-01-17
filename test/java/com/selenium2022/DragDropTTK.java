package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTTK {
	
	@Test
	
	public void dragDrop() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmakn\\eclipse-workspace\\com.selenium2022\\driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.taltektc.com/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("email")).sendKeys("Abc321@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abc1234");
		driver.findElement(By.className("my-login")).click();
		
		driver.findElement(By.linkText("Drag & Drop")).click();
		
		//WebElement drag = driver.findElement(By.id("boxA"));
		//WebElement drop = driver.findElement(By.id("boxB"));
		WebElement drag =driver.findElement(By.xpath("//div[@id='boxA']"));
		WebElement drop= driver.findElement(By.xpath("//div[@id='boxB']"));

		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(drag, drop).build().perform();
		//act.dragAndDropBy(drag, 260, 200).build().perform();	// passed if mouse pointer on drop box

		
		
	}

}
