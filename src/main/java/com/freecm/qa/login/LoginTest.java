package com.freecm.qa.login;

import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.util.Testutil;

import util.TestUtil;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Testutil.implicit_wait,TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/");

	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object data [][] = TestUtil.getLoginData("FILE HANDLE");
		return data;
		
		
	}
	
	
	@Test(dataProvider = "getLoginData")
	public void logintest(String username, String password) {
		
		
		   //driver.findElement(By.xpath("//*[@id=\"headerTop\"]/p/a[1]")).click();
		   //driver.navigate().forward();
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   
		  // String actualTitle = "https://parabank.parasoft.com/parabank/overview.htm";
			//Assert.assertEquals(driver.getTitle(), actualTitle);
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		
	}
	
	
}
