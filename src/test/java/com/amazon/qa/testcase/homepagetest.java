package com.amazon.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.Testbase;
import com.amazon.qa.pages.homepage;
import com.amazon.qa.pages.login;


public class homepagetest extends Testbase {

	homepage homep;
	login login;

	public homepagetest() {	
		super();
	}//method of homepage test


	@BeforeMethod
	public void setup() {
		initialization();
		homep = new homepage();

	}


     @Test
     public void home() {
    	login = homep.signin();
     }


	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}
