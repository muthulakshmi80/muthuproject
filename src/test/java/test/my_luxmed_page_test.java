package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import patient_portal.portal_patient;

public class my_luxmed_page_test {
	private static WebDriver driver = null;
public static void main(String[] args) {
	myluxmedpagetest();
	
}
public static void myluxmedpagetest()
{
	driver = new ChromeDriver();
	portal_patient p = new portal_patient(driver);
	driver.get("https://www.luxmed.pl/");
	p.clickloginbutton();
	
	
	}
}
