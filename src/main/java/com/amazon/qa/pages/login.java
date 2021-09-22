package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class login extends Testbase {


	// page factory
	@FindBy(id = "ap_email")
	WebElement email;

	@FindBy(id = "continue")
	WebElement button;

	//init page object
	public login() {

		PageFactory.initElements(driver, this);

	}//object intit class

	public Passwordpage signin(String ema) {

		email.sendKeys(ema);
		button.click();
		return new Passwordpage();
	}



}



