package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class Homeandkitchen extends Testbase {

	//pagefactory
	@FindBy(xpath = "//a[contains(text(),'Home & Kitchen')]")
	WebElement homekit;

	public Homeandkitchen() {

		PageFactory.initElements(driver, this);


	}//object

	public Homeandkitchen homekit() {

		homekit.click();
		return new Homeandkitchen();

	}

	public void selectjuicer() {
		WebElement selectjuice  = driver.findElement(By.xpath("//a[contains(text(),'Juicer Mixer grinder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectjuice);
		selectjuice.click();
		//return new Juicerpage_clone();
		//a[contains(text(),'Juicer Mixer grinder')]

	}



}
