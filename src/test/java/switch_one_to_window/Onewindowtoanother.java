package switch_one_to_window;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onewindowtoanother {
	
	

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    //    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/s?i=kitchen&bbn=11366947031&rh=n%3A11366947031%2Cp_89%3APHILIPS%7CPrestige%7CRico%7CSujata%2Cp_36%3A3444814031%2Cp_n_is_cod_eligible%3A4931671031%2Cp_n_condition-type%3A8609960031%2Cp_n_pct-off-with-tax%3A2665399031&dc&qid=1619161249&rnid=2665398031&ref=sr_nr_p_n_pct-off-with-tax_1");
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

       // driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("soap");
        //driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("//*[contains(text(),'Park Avenue Soap')]")).click();
       /* WebElement select1 = driver.findElement(By.xpath("//span[normalize-space()='Park Avenue Cool Blue Fragrant Soap, 125g (Buy3 Get 1 Free)']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", select1);
		select1.click();*/
        driver.findElement(By.xpath("//span[normalize-space()='Prestige PCJ 7.0 500-Watt Centrifugal Juicer']"));
        
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
    }

}
	


