package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateTime {
	
	@Test

    public void dateTimePicker(){

       // System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/");

        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//input[@type='datetime-local' and @name='bdaytime']"));		

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("11152018");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 AM

        dateBox.sendKeys("0245AM");

    }

}
