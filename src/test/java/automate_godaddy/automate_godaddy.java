package automate_godaddy;


//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class automate_godaddy  {

	public static void main(String[] args) throws InterruptedException {


		//expected tile 
		//String expe_title = "titleGoogle";

		//open browser with specified url

		//System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		//windows maximize
		driver.manage().window().maximize();

		//click amazon Pay .after maximize only you can click amazon pay
		//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();

		// click sign up and enter existing user. 

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-1 nav-progressive-content' and text()='Hello, Sign in']"))).build().perform();
		driver.findElement(By.xpath("//span[@class='nav-action-inner' and text()='Sign in']")).click();

		//driver.findElement(By.id("nav-link-accountList")).click();;
		driver.findElement(By.name("email")).sendKeys("lakshmikdr80@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("BAnana1980");
		driver.findElement(By.id("signInSubmit")).click();

		//click all menu
		driver.findElement(By.className("hm-icon-label")).click();
		Thread.sleep(100);

		//a-size-small a-color-base	

		//Below code will scroll the web page till end and select the womens fashion




		WebElement element = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[18]/a/div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
		element.click();
		//Thread.sleep(100);

		//below code select clothing from womens fashion

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[11]/li[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		//Thread.sleep(100); 
		element1.click();


		//below code used to select avg.customer review.


		/*WebElement avg_review= driver.findElement(By.cssSelector("div.a-section[aria-label=\"4 Stars & Up\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", avg_review);
		//System.out.println("Attribute value is " + element2.getAttribute("value"));
		avg_review.click();*/

		WebElement avg_review= driver.findElement(By.xpath("//div[@aria-label='4 Stars & Up'and @class='a-section']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", avg_review);
		//System.out.println("Attribute value is " + element2.getAttribute("value"));
		avg_review.click();


		/*driver.get("https://www.amazon.in/gp/browse.html?node=1953602031&ref_=nav_em_sbc_wfashion_clothing_0_2_11_2");
			driver.findElement(By.xpath("//div[@aria-label='4 Stars & Up']")).click();*/



		//click westernwear_clothe after avg.customer review

		WebElement westernwear_clothe= driver.findElement(By.xpath("//span[text()='Western Wear']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", westernwear_clothe);
		//System.out.println("Attribute value is " + element2.getAttribute("value"));
		westernwear_clothe.click();



		//click westernwear inner links

		WebElement type_of_west= driver.findElement(By.cssSelector("ul[aria-labelledby='n-title']>li:nth-of-type(4)"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", type_of_west);
		//System.out.println("Attribute value is " + element2.getAttribute("value"));
		type_of_west.click();



		//again to home page

		driver.navigate().to("https://www.amazon.in/");

		// Getting today'deal link in home page.

		WebElement today_deal = driver.findElement(By.linkText("Today's Deals"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", today_deal);
		//Thread.sleep(100); 
		today_deal.click();








		/*	WebElement department = driver.findElement(By.cssSelector("#departments >ul >li:nth-of-type(3)"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", department);
			//Thread.sleep(100); 
			department.click();*/



		//driver.find_element_by_xpath("//span[contains(@class,'Trsdu')]").text)

		/*   WebElement brands=driver.findElement(By.id("p_89/MYZA"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", brands);
			 Select brandsselect=new Select(brands);
		    brandsselect.selectByVisibleText("MYZA");
			//Thread.sleep(200);
			//driver.navigate().back();*/




	}

}

//***********************************************************************88

/* //JavascriptExecutor jse = (JavascriptExecutor)driver;
//jse.executeScript("arguments[0].scrollintoview(true)", args);
//	 EventFiringWebDriver eve = new EventFiringWebDriver(driver);
//eve.executeScript("document.queryselector()", args);




	/*	WebElement element2= driver.findElement( By.xpath("//div[@aria-label='4 Stars & Up']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		//Thread.sleep(100); 
		element2.click();*/

//System.out.println("Attribute value is " + btnelement.getAttribute("value"));









//driver.findElement(By.tagName("4 Stars & Up")).click();

/*WebElement element2 = driver.findElement(By.tagName("4 Stars & Up"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		//Thread.sleep(100); 
		element2.click();*/


/*WebElement link = driver.findElement(By.linkText("4 Stars & Up"));
		// assertEquals("#test1", link.getAttribute("href"));*/
// driver.findElement(By.cssSelector("div[class='value test']"))

/*	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[1]/span/a/div/span"));
		List<WebElement> links = element2.findElements(By.tagName("li"));
		for (int i = 1; i < links.size(); i++)
		{
		    System.out.println(links.get(i).getText());
		    element2.click();
		}*/







//driver.findElement(By.cssSelector("[class*='a-icon a-icon-star-medium a-star-medium-4']")).click();

//driver.close();
//driver.quit();


//driver.findElement(By.cssSelector("ul#a-unordered-list a-nostyle a-vertical a-spacing-medium li:nth-of-type(1)"));


////*[@id="hmenu-content"]/ul[1]/li[18]/a*/






/*JavascriptExecutor jse = (JavascriptExecutor) driver;
//Below code will scroll the web page till end
jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

//Thread.sleep(1000);

JavascriptExecutor jse = (JavascriptExecutor) driver;
//Find element by link text and store in variable "el"        		
WebElement el = driver.findElement(By.cssSelector(""));
//Below code will scroll the page till the element is found		
jse.executeScript("arguments[0].scrollIntoView();", el);

//	driver.findElement(By.className("hmenu-item)")).click();
//driver.findElement(By.className("hmenu-item")).click();*/






//Thread.sleep(5000);
//driver.navigate().back();

//windows maximize
//   driver.manage().window().maximize();

/* //validate the title
String act_title = driver.getTitle();
System.out.println("title"+act_title);
if (expe_title.equals(act_title)) {

	System.out.println("passed");

}

else {

	System.out.println("failed");
}
//  driver.manage().window().setPosition(new Point(0,-1000));
//  driver.manage().window().minimize();*/

//   Thread.sleep(9000);
//driver.close();
// driver.quit();*/

//below code used to select avg.customer review.

/* WebElement a_review= driver.findElement(By.cssSelector("ul.a-spacing-medium>li:nth-of-type(1)"));
  //WebElement a_review= driver.findElement(By.xpath("//div[@aria-label='4 Stars & Up' and @class= 'a-section']"));
	WebElement a_review = driver.findElement(By.xpath("//div[@aria-label=\"4 Stars & Up\" and @class=\"a-section\"]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", a_review);
	a_review.click();


	// Thread.sleep(100);
	////div[@aria-label="4 Stars & Up"]--- xpath
	//div[@aria-label="4 Stars & Up" and @class="a-section"]
	          ////div[@aria-label='Any time']/div[@class='mn-hd-txt' and text()='Any time']
 */








