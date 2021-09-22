package checkboxdemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkdemotest2_amazon {

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
		
		
		//select and deselect the checkbox
		
		
		
		
		
		if(!driver.findElements(By.xpath("//a[normalize-space()='Select all items']")).isEmpty()){

			//Clicking on button2, which appears when button1 is not present
			                WebDriverWait wait = new WebDriverWait(driver, 30);
			                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Select all items']")));

			                Thread.sleep(2000);
			                driver.findElement(By.xpath("//a[normalize-space()='Select all items']")).click();
			                
			        }

			        else if(driver.findElement(By.xpath("//a[normalize-space()='Deselect all items']")).isEnabled() ){

			//clicking on button1
			                WebDriverWait wait = new WebDriverWait(driver, 30);
			                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Deselect all items']")));

			        driver.findElement(By.xpath("//a[normalize-space()='Deselect all items']")).click();


			    }
			    else
			        {
			            System.out.println("No such button found");
			        }
			        Thread.sleep(5000);
			
		
	}

	}
//sc-carts-container
//body[1]/div[1]/div[4]/div[1]/div[2]

		
//*******************************************************************	
		
		
	/*	boolean x  = driver.findElement(By.xpath("//a[normalize-space()='Select all items']")).isSelected();
		boolean y =  driver.findElement(By.xpath("//a[normalize-space()='Deselect all items']")).isSelected();
		             
		if (x== true)
		{
			driver.findElement(By.xpath("//a[normalize-space()='Select all items']")).click();
		}
		
		else if (y== true) {
			driver.findElement(By.xpath("//a[normalize-space()='Deselect all items']"));
		}
		
		
	/*	WebElement deselect = driver.findElement(By.xpath("//a[normalize-space()='Deselect all items']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deselect);
		deselect.click();
	
		
		boolean bVal = true;

		bVal = deselect.isSelected();

		if (bVal == true) {
			driver.findElement(By.xpath("//a[normalize-space()='Select all items']")).click();
		} */
		
		/*WebElement select = driver.findElement(By.xpath("//a[normalize-space()='Select all items']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", select);
		select.click();
	    Thread.sleep(30);
		//a[normalize-space()='Deselect all items']
		boolean bVal = true;

		bVal = select.isSelected();

		if (bVal == false) {
		//	driver.findElement(By.xpath("//a[normalize-space()='Deselect all items']")).click();
		//	driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > div:nth-child(7) > div:nth-child(3) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")).click();
			
			WebElement select1 = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > div:nth-child(7) > div:nth-child(3) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", select1);
			select1.click();
			
		} */
		
		
		
		
		
//************************** below is good logic*******************************

		/*String beforecssselector = "#s-refinements > div:nth-child(5) > ul > li:nth-child(";
		String aftercssselector  = ") > span > a > div > label > i";	

		for (int i=1;i<=7;i++) {
			String actual = beforecssselector+i+aftercssselector;
			WebElement brands = driver.findElement(By.cssSelector(actual));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", brands);
			brands.click();


		}*/

	


/*#s-refinements > div:nth-child(5) > ul > li:nth-child(1) > span > a > div > label > i
#s-refinements > div:nth-child(5) > ul > li:nth-child(2) > span > a > div > label > i
#s-refinements > div:nth-child(5) > ul > li:nth-child(3) > span > a > div > label > i
#s-refinements > div:nth-child(5) > ul > li:nth-child(5) > span > a > div > label > i
#s-refinements > div:nth-child(5) > ul > li:nth-child(6) > span > a > div > label > i
#s-refinements > div:nth-child(5) > ul > li:nth-child(7) > span > a > div > label > i*/

