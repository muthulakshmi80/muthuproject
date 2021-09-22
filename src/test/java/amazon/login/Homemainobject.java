package amazon.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homemainobject {
	WebDriver driver = null;
	
	By search_login = By.id("nav-link-accountList");
	By login_text = By.name("email");
	By continue_btk = By.id("continue");
	By pass_text = By.id("ap_password");
	By submit_btk = By.id("signInSubmit");
	
	public Homemainobject(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void login_se() {
		driver.findElement(search_login).click();
	}
	
	public void settext() {
		driver.findElement(login_text).sendKeys("lakshmikdr80@gmail.com");
	}
	
	
	public void btk_continue() {
		driver.findElement(continue_btk).click();
	}
	
	
	public void set_pass() {
		driver.findElement(pass_text).sendKeys("BAnana1980");
	}
	
	public void btk_submit() {
		driver.findElement(submit_btk).click();
	}
	
	
	

}
