package demoguru;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/html/addAccount.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys(Keys.ENTER);

	
		Select fruits = new Select(driver.findElement(By.xpath("//select[@name='selaccount']")));
		fruits.selectByVisibleText("savings");
		fruits.selectByIndex(1);
		
		
		WebElement depo = driver.findElement(By.xpath("//input[@name='inideposit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", depo);
		depo.sendKeys("5000");
		
		
		
	
		

		WebElement submit = driver.findElement(By.xpath("//input[@name='button2']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click();
		
		



	}

}
