package patient_portal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class portal_patient {

	WebDriver driver = null;
	By search_class = By.linkText("Login");
	public portal_patient (WebDriver driver) {
		this.driver = driver;
		
	}
	public void clickloginbutton() {
		driver.findElement(search_class).sendKeys(Keys.RETURN);
		//driver.findElements(search_class).click();
		
	}
}
