package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class Today_deal extends Testbase {

	//pagefactory
	@FindBy(linkText = "Today's Deals")
	WebElement linktext;
	@FindBy(xpath= "//span[contains(text(),'All Available')]")
	WebElement allavailable;




	public Today_deal() {

		PageFactory.initElements(driver, this);

	}//object

	public Today_deal todaydeal() {

		linktext.click();
		return new Today_deal();
	}


	
}
