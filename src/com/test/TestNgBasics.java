package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	/* output will be executed like this
	 * 
	 *  Set up the installation
      Login to the page
      Launch Browser
       Enter Url
      Google test for title
    Logout from app
     closing the Browser
        deleteAllCookies */

		 //Pre-conditions :
	@BeforeSuite
		 
		 public void setUp()
		 {
			 System.out.println("Set up the installation");
	     }
		 
		 @BeforeClass
		 
		 public void launchBrowser()
		 {
			 System.out.println("Launch Browser");
		 }
		 
		 @BeforeMethod
		 
		 public void Url()
		 {
			 System.out.println("Enter Url");
		 }
		 
		 @BeforeTest
		 
		 public void login()
		 {
			 System.out.println("Login to the page");
		 }
		//Test Cases : 
		 @Test
		 
		 public void googleTitleTest()
		 {
			 System.out.println(" Google test for title");
		 }
		 // Post Conditions
		 @AfterMethod
		 public void logout(){
			 System.out.println("Logout from app");
		 }
		 
		 @AfterTest
		 
		 public void deleteAllCookies(){
			 System.out.println("deleteAllCookies");
		 }
		 
		 @AfterClass
		 public void closeBrowser(){
			 System.out.println("closing the Browser");
		 }
		 
		 @AfterSuite

		 public void generateTestReport(){
			 System.out.println("generating the Test Report");
		 }
}
