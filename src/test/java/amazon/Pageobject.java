package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.login.Homemainobject;



public class Pageobject {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		page();

	}
	
	
	
	public static void page() {
		
		 driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
	//load amazon
		driver.get("https://www.amazon.in/");
		
		//windows maximize
		driver.manage().window().maximize();
		Homemainobject homobj = new Homemainobject(driver);
		homobj.login_se();
		homobj.settext();
		homobj.btk_continue();
		homobj.set_pass();
		homobj.btk_submit();
		
		
		
		
	}
		
}

