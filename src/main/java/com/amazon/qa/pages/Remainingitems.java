package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class Remainingitems extends Testbase{
	
	public Remainingitems() {

		PageFactory.initElements(driver, this);

	}//obje
	
	//click price
		public void price() {
			WebElement price3 = driver.findElement(By.xpath("//div[4]//ul[1]//li[2]//span[1]//a[1]//span[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", price3);
			price3.click();
			System.out.println(price3);

			
			
		}
		
		
		//click cash on delivery
		public void pod() {
			WebElement cod = driver.findElement(By.cssSelector("li[aria-label='Eligible for Pay On Delivery'] span[class='a-size-base a-color-base a-text-bold']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cod);
			cod.click();
			System.out.println(cod);

			
			
		}
		
		//click the item condition
		
		public void itemcondition() {
			WebElement itemc = driver.findElement(By.cssSelector("//span[contains(text(),'New')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", itemc);
			itemc.click();
			System.out.println(itemc);

			
			
		}
		//select discount
		
		public void discount() {
			WebElement discount10 = driver.findElement(By.cssSelector("//span[contains(text(),'New')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", discount10);
			discount10.click();
			System.out.println(discount10);

			
			
		}
		
		public void selpro() {
			WebElement selproduct = driver.findElement(By.xpath("//span[normalize-space()='Prestige PCJ 7.0 500-Watt Centrifugal Juicer']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selproduct);
			selproduct.click();
			System.out.println(selproduct);

			
			
		}

}
