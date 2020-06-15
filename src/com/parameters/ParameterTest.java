package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "url", "email", "password" })
	public void yahooLoginTest(String url, String email, String password) {
		System.setProperty("webdriver.chrome.driver", "C://Users//MMeghana//Downloads//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();

		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();

	}

}