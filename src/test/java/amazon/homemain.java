package amazon;

import java.util.concurrent.TimeUnit;

import amazon.login.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homemain {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		amazonmain();
		
	}
	
	
	public static void amazonmain() {
		
		 driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
	//load amazon
		driver.get("https://www.amazon.in/");
		
		//windows maximize
		driver.manage().window().maximize();
				
		
		Login.login_page(driver).click();
		Login.login_box(driver).sendKeys("lakshmikdr80@gmail.com");
		Login.continue_button(driver).click();
		Login.pass_box(driver).sendKeys("BAnana1980");
		Login.submit_button(driver).click();
	}

}
