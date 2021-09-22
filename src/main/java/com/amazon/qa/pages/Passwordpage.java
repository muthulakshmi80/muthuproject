package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class Passwordpage extends Testbase {

	//page factory
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement pass;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement submit;

	//init page object
	public Passwordpage() {

		PageFactory.initElements(driver, this);

	}//object intit class
	
	
	public void signin(String pa) {

		pass.sendKeys(pa);
		submit.click();
		//return new homepage();
	}



}

