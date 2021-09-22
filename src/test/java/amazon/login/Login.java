package amazon.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public static WebElement element = null;
	
	
	//click the login page
	
	public static WebElement login_page(WebDriver driver) {
		element = driver.findElement(By.id("nav-link-accountList"));
		return element;
		
	}
	
	
	
	
	//Login for existing user
	
	public static WebElement login_box(WebDriver driver) {
		element = driver.findElement(By.name("email"));
		return element;
		
	}
	
	
	//click for continue
	
	public static WebElement continue_button(WebDriver driver) {
		element = driver.findElement(By.id("continue"));
		return element;
		
	}
	
		
	// password
	public static WebElement pass_box(WebDriver driver) {
		element = driver.findElement(By.id("ap_password"));
		return element;
		
	}
		
	//click submit button
	public static WebElement submit_button(WebDriver driver) {
		element = driver.findElement(By.id("signInSubmit"));
		return element;
		
	}
		
				
		
	
	}
	

	


