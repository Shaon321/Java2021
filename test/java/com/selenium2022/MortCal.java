package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortCal {
	@Test
	
	
	public void mortcalculator() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		System.out.println(driver.getWindowHandle());
		if(driver.getTitle().equalsIgnoreCase("Mortgage Calculator")) {
			System.out.println("Landed on correct page");
		}
		else {
			System.out.println("Incorrect page");
		}
		driver.findElement(By.id("homeval")).sendKeys("500000");
		driver.findElement(By.id("downpayment")).sendKeys("80000");
		driver.findElement(By.xpath("//input[@value=\"money\"]")).click();
		System.out.println(driver.findElement(By.id("loanamt")).getAttribute("value"));

		driver.findElement(By.id("intrstsrate")).sendKeys("5.2");
		
		driver.findElement(By.id("loanterm")).sendKeys("20");

		WebElement month = driver.findElement(By.name("param[start_month]"));
		Select sel = new Select(month);
		sel.selectByValue("5");
		
		driver.findElement(By.id("start_year")).sendKeys("2022");
		driver.findElement(By.className("styled-button")).click();
		
		
		
		//driver.close();
	}

}
