package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

public class sample {
	WebDriver driver;

	@Test
	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("samudraapps914@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Sairam@2018@");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
	}
	@Test
	public void close()
	{
		driver.close();
	}
	
}
