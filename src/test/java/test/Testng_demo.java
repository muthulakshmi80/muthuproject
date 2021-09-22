package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import patient_portal.portal_patient;

public class Testng_demo {
	WebDriver driver = null;
	
	
	
	@BeforeTest
public void setuptest() {
	driver = new ChromeDriver();
}
	
	// in testng we donot need main method
	
/*public static void main(String[] args) {
	myluxmedpagetest();
	
}*/
	
	@Test
public  void myluxmedpagetest()
{
	
		driver.get("https://www.luxmed.pl/");
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		extent.createTest("MyFirstTest")
		  .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		extent.flush();
;
		
		
	
	
	
	}


@AfterTest
public void teardown() {
	
	driver.close();
	
	System.out.println("tested");
}
}
