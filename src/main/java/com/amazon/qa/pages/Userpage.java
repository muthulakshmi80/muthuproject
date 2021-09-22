package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class Userpage extends Testbase{
	
	//pagefactory
	
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1' and text() = 'Hello, lakshmi']")
	WebElement usernamelabel;
	
	public Userpage() {

		PageFactory.initElements(driver, this);

	}//object intit method
	
	
	public boolean verifyhomepageuser() {
		
		return usernamelabel.isDisplayed();
	}

	
	
		
		
	
}
