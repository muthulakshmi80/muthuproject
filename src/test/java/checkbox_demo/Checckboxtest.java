package checkbox_demo;

import java.util.List;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checckboxtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-1 nav-progressive-content' and text()='Hello, Sign in']"))).build().perform();
		driver.findElement(By.xpath("//span[@class='nav-action-inner' and text()='Sign in']")).click();

		//driver.findElement(By.id("nav-link-accountList")).click();;
		driver.findElement(By.name("email")).sendKeys("lakshmikdr80@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("BAnana1980");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.cssSelector("#nav-cart-text-container")).click();
		
		//body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > div:nth-child(7) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2
		//body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > div:nth-child(7) > div:nth-child(5) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)

		/*List <WebElement> list= driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
			((JavascriptExecutor) driver).executeScript(" arguments[0].scrollIntoView;",list);
			Point hoverItem =driver.findElement(By.cssSelector("input:checked[type='checkbox']")).getLocation();
			((JavascriptExecutor)driver).executeScript("return window.title;");    
			Thread.sleep(6000);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+(hoverItem.getY())+");");*/

		//List<WebElement> allcheckbox = driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
	//	List<WebElement> allcheckbox = driver.findElements(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]"));
		//WebElement parent = driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]"));  
		//List<WebElement> children = driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
		List<WebElement> children = driver.findElements(By.className(".a-icon.a-icon-checkbox"));
		int checkboxsize = children.size();
		String checkbox = ((WebElement)children.get(0)).getAttribute("checked");
		
		for (int i = 0; i < checkboxsize; i++) {
			((WebElement)children.get(0)).click();
			
		}
		
		
		/*Select list = new Select(driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]")));
		
			list.deselectByIndex(0);
			list.deselectByIndex(1);
			list.deselectByIndex(2);
			list.deselectByIndex(3);
			list.deselectByIndex(4);*/
			
	
		
		/*listbox.selectByIndex(0);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		List<WebElement> list = driver
				.findElements(By.xpath("//input[@type ='checkbox']"));


		boolean bVal = false;

		bVal = list.get(1).isSelected();

		if (bVal == true) {
			list.get(2).click();
		} else {

			list.get(1).click();
		}*/

	}

}


		// Find the checkbox  by its name.

	/*	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		List<WebElement> list = driver
				.findElements(By.xpath("//input[@type ='checkbox']"));*/
		
		/*List <WebElement> list= driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
		((JavascriptExecutor) driver).executeScript("return arguments[0].scrollIntoView();",list);
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		List<WebElement> list = driver
				.findElements(By.xpath("//input[@type ='checkbox']"));*/

		// Get the number of checkboxes available.
		//int count = list.size();
		//System.out.println("no .of boxes  :" +count);
		// Now, iterate the loop from first checkbox to last checkbox.
		//for (int i = 0; i < count; i++) {

			// Store the checkbox name to the string variable, using 'Value'
			// attribute
			//String sValue = list.get(i).getAttribute("value");
		//	String sValue = list.get(i).getText();


			// Select the checkbox if its value is the same that you want.
			//if (sValue.equalsIgnoreCase("")) {

			//	list.get(i).click();

				// This statement will get you out of the for loop.
				//break;
		//	}

	//	}*/
	
	
		//span[@class='a-size-base a-color-base' and contains(text(),'PHILIPS')]"
	/*String xpath ="//span[@class='a-size-base a-color-base' and contains(text(),'PHILIPS')]";
		WebElement philps = driver.findElement(By.xpath(xpath));
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

		WebElement kent = driver.findElement(By.xpath("//span[@class = 'a-size-base a-color-base a-text-bold' and contains(text(),'KENT')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kent);
		kent.click();
		
		WebElement Rico = driver.findElement(By.xpath("//span[@class = 'a-size-base a-color-base' and contains(text(),'Rico')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Rico);
		Rico.click();
		System.out.println(Rico);
		
		Thread.sleep(70);
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();

		
		
		
		
		//span[contains(text(),'KENT')]
		
									
									
	
	
	
	
	}
	
	
}*/


//*******************************************************************************



		
		
		
		
























/*boolean bVal = false;

bVal = list.get(1).isSelected();

if (bVal == true) {
    
	list.get(2).click();
} else {
    
	list.get(1).click();
}
	
		/*((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List<WebElement> req = driver
		              .findElements(By.xpath("//input[@type ='checkbox']"));
		
		boolean check = false;
		check = req.get(1).isEnabled();
		if(check == true)
		{
			req.get(3).click();
		}*/
		
		
		
	/*	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		List<WebElement> req = driver
		              .findElements(By.className("a-icon.a-icon-checkbox"));
		
		for(WebElement objcurrentcheck : req) {
			String strchcek = objcurrentcheck.getText();
			System.out.println(strchcek);
		}*/

/*List<WebElement>	elements = driver.findElements(By.className("a-icon.a-icon-checkbox"));
int checekd =0;
int unchecekd =0;
for (int i=0;i<elements.size();i++)
{
	
	if (elements.get(i).isSelected()== true)
		checekd++;
		
	else
		unchecekd++;
		
}
 
 System.out.println("checker"+checekd);
 System.out.println("checker"+unchecekd);*/
 

 //  List<WebElement> list = driver.findElements(By.name("days"));

// Get the number of checkboxes available.
/*int count = list.size();
System.out.println("no .of boxes  :" +count);
// Now, iterate the loop from first checkbox to last checkbox.
for (int i = 0; i < count; i++) {

    // Store the checkbox name to the string variable, using 'Value'
    // attribute
    String sValue = list.get(i).getAttribute("value");

    // Select the checkbox if its value is the same that you want.
    if (sValue.equalsIgnoreCase("PHILIPS")) {

        list.get(i).click();

        // This statement will get you out of the for loop.
        break;
    }

}



	List <WebElement> li= driver.findElements(By.xpath("//input[@type ='checkbox']"));
	((JavascriptExecutor) driver).executeScript("return arguments[0].scrollIntoView();",li);
	
	
	boolean check = false;
	check = li.get(1).isEnabled();
	if(check == true)
	{
		li.get(3).click();
		/*li.get(4).click();
		li.get(5).click();
		li.get(6).click();
		li.get(7).click();
		li.get(8).click();
		li.get(9).click();
	}

	WebElement li  = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'PHILIPS')]"));
	
	//li.click();
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",li);


	List<WebElement> objcheck = driver.findElements(By.xpath("//input[@type ='checkbox']"));
for(WebElement objcurrentcheck : objcheck) {
	String strchcek = objcurrentcheck.getText();
	System.out.println(strchcek);
}*/