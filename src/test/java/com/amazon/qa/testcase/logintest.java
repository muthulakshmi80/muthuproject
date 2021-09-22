package com.amazon.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.Testbase;
import com.amazon.qa.pages.homepage;
import com.amazon.qa.pages.login;

public class logintest extends Testbase {
	
	homepage homep;
	login login;
	
	public logintest() {	
		super();
	}//method of homepage test
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		homep = new homepage();
		homep.signin();
		login = new login();
		
	}
	
	
	@Test
	public void login() {
		
		login.signin(prop.getProperty("username"));
	}
	
	@AfterMethod
	public void teardown() {

		driver.quit();

    }
}	
