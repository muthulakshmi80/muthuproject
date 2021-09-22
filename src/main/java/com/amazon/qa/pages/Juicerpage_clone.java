package com.amazon.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.Testbase;

/*public class Juicerpage_clone extends Testbase {

	//pagefactory
	@FindBy(xpath = "//a[contains(text(),'Home & Kitchen')]")
	WebElement homekit;
	
	public Juicerpage_clone() {

		PageFactory.initElements(driver, this);
		
	}//object
	
public Juicerpage_clone juicerpageclick() {
		
		WebElement juicer = driver.findElement(By.linkText("Juicer Mixer grinder"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", juicer);
		juicer.click();
		return new Juicerpage_clone();
		
		
	}

	

}*/

//********************************************



public class Juicerpage_clone extends Testbase {

	//pagefactory
	@FindBy(xpath = "//a[contains(text(),'Juicers')]")
	WebElement juicer;

	@FindBy(xpath ="//a[@class ='a-color-base a-link-normal'] //span[contains(text(),'Centrifugal Juicers')] ")
	WebElement juicermodel;

	public Juicerpage_clone() {

		PageFactory.initElements(driver, this);

	}//object

	public void juicerpageclick() {

		juicer.click();
		//return new Juicerpage_clone();


	}

	public void selectjuicertype() {
		juicermodel.click();


	}
	public void brand() {


//click brands
		WebElement philps = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'PHILIPS')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", philps);
		philps.click();
		//driver.navigate().back();
		System.out.println(philps);


		WebElement presitage = driver.findElement(By.xpath("//span[contains(text(),'Prestige')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", presitage);
		presitage.click();
		System.out.println(presitage);



		WebElement Sujata = driver.findElement(By.xpath("//span[@class = 'a-size-base a-color-base' and contains(text(),'Sujata')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Sujata);
		Sujata.click();
		System.out.println(Sujata);

		/*WebElement kent = driver.findElement(By.cssSelector("/li[aria-label='KENT'] span[class='a-size-base a-color-base'])]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kent);
		kent.click();?*/

		WebElement Rico = driver.findElement(By.xpath("//span[@class = 'a-size-base a-color-base' and contains(text(),'Rico')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Rico);
		Rico.click();
		System.out.println(Rico);


		System.out.println(driver.getTitle());

	}
	//click price
	public void price() {
		WebElement price3 = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/span[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/span[1]/a[1]/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", price3);
		price3.click();
		System.out.println(price3);

		
		
	}
	
	
	//click cash on delivery
	public void pod() {
		WebElement cod = driver.findElement(By.cssSelector("li[aria-label='Eligible for Pay On Delivery'] i[class='a-icon a-icon-checkbox']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cod);
		cod.click();
		System.out.println(cod);

		
		
	}
	
	//click the item condition
	
	public void itemcondition() {
		WebElement itemc = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", itemc);
		itemc.click();
		System.out.println(itemc);

		
		
	}
	//select discount
	
	public void discount() {
		WebElement discount10 = driver.findElement(By.xpath("//span[contains(text(),'10% Off or more')]"));
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
	//input[@id='add-to-cart-button'] add to card
	//input[@data-asin='B00VK1MZ10'] add for insurance
	
	public void addcart() {
		driver.findElement(By.xpath("//span[normalize-space()='Prestige PCJ 7.0 500-Watt Centrifugal Juicer']"));
        
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.xpath("//input[@data-asin='B00VK1MZ10']")).click();;

		
		
	}
	
	
	


}









	/*
	 * 
	 * 
	 * 888888888888888888888888888888888888888888888888888888888888
	 * 
	 * 
	 * 
	 * 
	 * List<WebElement> brand= driver.findElements(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/span[1]/a[1]/span[1]"));
		// Instead of using the for each loop, get the size of the list and iterate through it
		for (int i=0; i<brand.size(); i++) {
		    try {

		    	brand.get(i).click();
		    } catch (StaleElementReferenceException e) {
		        // If the exception occurs, find the elements again and click on it
		    	 brand= driver.findElements(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/span[1]/a[1]/span[1]"));
		    	brand.get(i).click();
			
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	/*	List<WebElement> text = driver.findElements(By.className("btnstyle greenbtn"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", text.get(1));
		
		WebElement selectjuice  = driver.findElement(By.xpath("//a[contains(text(),'Juicer Mixer grinder')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectjuice);
		selectjuice.click();*/
				

		    
		









