package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class AppTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void TestSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
		
	@Test
	public void SeleniumTest() throws InterruptedException
	{
	
		driver.navigate().to("http://localhost:8000/notificationapp-1/devices");
		System.out.println("Successfully got devices");				
		
	}
	
	@AfterClass
	public void CloseDriver()
	{
		//driver.quit();		
	}

}
