package datecalender_demo;


import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_pick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/Congratulations-Great-life-mail-Amazon/dp/B07BTPJ1Z3/ref=sr_1_6?crid=281TFIBLQ6RSF&dchild=1&keywords=gift+vouchers&qid=1619597446&s=gift-cards&sprefix=gift+vo%2Caps%2C271&sr=1-6");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

	/*	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("gift vouchers");
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);

		WebElement select1 = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[7]/div[1]/span[1]/div[1]/div[1]/div[2]/h2[1]/a[1]/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", select1);
		select1.click();*/


		/*Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);*/
		WebElement amount = driver.findElement(By.cssSelector("#gc-mini-picker-amount-3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", amount);
		amount.click();

		WebElement share_email = driver.findElement(By.xpath("//button[normalize-space()='Email']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",share_email);
		share_email.click();

		WebElement to_email = driver.findElement(By.xpath("//textarea[@placeholder='Enter recipient e-mail address']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",to_email);
		to_email.sendKeys("lakshmikdr80@gmail.com");
		to_email.sendKeys(Keys.ENTER);

		WebElement from = driver.findElement(By.id("gc-order-form-senderName"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",from);
		from.sendKeys("Muthu");
		from.sendKeys(Keys.ENTER);

		WebElement message = driver.findElement(By.id("gc-order-form-message"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",message);
		message.sendKeys("happy birthday");
		message.sendKeys(Keys.ENTER);

		WebElement quantity= driver.findElement(By.cssSelector("#gc-order-form-quantity"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",quantity);
		quantity.sendKeys("");
		quantity.sendKeys(Keys.ENTER);

		

		String dot="28/04/2021";
		String date,month,year;
		String caldt,calmonth,calyear;
		/*
		* Spliting the String into String Array
		*/
		String dateArray[]= dot.split("/");
		date=dateArray[0];
		month=dateArray[1];
		year=dateArray[2];

		      
		driver.findElement(By.xpath("//input[@aria-label='Date with format d d/m m/y y y y']")).click();

		WebElement cal;
		cal=driver.findElement(By.className("a-cal-month-table"));
		//calyear=driver.findElement(By.xpath("//h4[contains(text(),'2021')]")).getText();
		
		/*Select the year
		
		while (!calyear.equals(year)) 
		{
			driver.findElement(By.className("")).click();
		calyear=driver.findElement(By.cssSelector("h4[class='a-cal-month-header']")).getText();
		System.out.println("The Displayed Year::" + calyear);
		}//while end year*/

	//	calyear=driver.findElement(By.xpath("//h4[contains(text(),'2021')]")).getText();
		
		// Select the Month
		
		/*while (!calyear.equalsIgnoreCase(month)) 
		{
		//driver.findElement(By.className("")).click();
			calyear=driver.findElement(By.cssSelector("h4[class='a-cal-month-header']")).getText();
		
		}//while end month*/

		cal=driver.findElement(By.className("a-cal-month-table"));
		/**
		* Select the Date
		*/
		List<WebElement> rows,cols;
		rows=cal.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) 
		{
		cols=rows.get(i).findElements(By.tagName("td"));
		for (int k = 0; k < cols.size(); k++) 
		{
		caldt=cols.get(k).getText();
		if (caldt.equals(date)) 
		{
		cols.get(k).click();
		break;
		}//if
		}//for inner
		}//for outer
		
		WebElement addcart= driver.findElement(By.xpath("//span[@data-action='gc-retail-atc']//div//span//span//input[@name='submit.gc-add-to-cart']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",addcart);
		addcart.click();


			
		}

	}
