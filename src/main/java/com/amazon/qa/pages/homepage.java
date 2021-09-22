package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class homepage extends Testbase{


	// page factory
	@FindBy(xpath = "//span[@class='nav-line-1 nav-progressive-content' and text()='Hello, Sign in']")
	WebElement moveto;

	@FindBy(xpath = "//span[@class='nav-action-inner' and text()='Sign in']")
	WebElement signin;

	//init page object
	public homepage() {

		PageFactory.initElements(driver, this);

	}//object intit class

	public login signin() {

		Actions action = new Actions(driver);
		action.moveToElement(moveto).build().perform();
		signin.click();
		return new login();



	}//actionfor signin class





}//base class
