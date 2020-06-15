package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleTest {
	
	WebDriver driver ;
	@BeforeMethod
	public void setUpGoogle(){
		System.setProperty("webdriver.chrome.driver", "C://Users//MMeghana//Downloads//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(14, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
	}
	@Test
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	  Assert.assertEquals( title , "Google","Title is not matched");
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}