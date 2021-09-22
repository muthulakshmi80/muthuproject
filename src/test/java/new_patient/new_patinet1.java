package new_patient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.List;


public class new_patinet1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.luxmed.pl/");
		//WebElement searchForm = driver.findElement(By.tagName("form"));
		
		// driver.findElement(By.tagName("Login")).sendKeys(Keys.RETURN);
//		driver.findElement(By.tagName("https://rezerwacja.luxmed.pl/start/portalpacjenta")).click();
			//driver.findElement(By.tagName("Patient Portal")).click();
			//driver.get("href=\"https://rezerwacja.luxmed.pl/start/portalpacjenta\"");
		
			
		//	browser = webdriver.chrome();
			
		 
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.luxmed.pl/");
		 
		 driver.findElement(By.xpath("//*[@id=\"headerTop\"]/p/a[1]")).click();
		   driver.navigate().forward();
		    driver.findElement(By.name("Login")).sendKeys("Muthulakshmi");
		   driver.findElement(By.name("Password")).sendKeys("BAnana1980");
		   driver.findElement(By.xpath("//*[@id=\"ShowSignsLogInRow\"]/button")).click();
		   driver.manage().window().maximize();
		   
	
		   
		   {
			   Thread.sleep(5000);
			   }
		  
		  driver.findElement(By.id("logOut"));
		  driver.navigate().back();
		  
		   
		
		// driver.get("https://www.luxmed.pl/");
		
	
		

				
			
			
		 
	
	}

}
