package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.util.Testutil;

public class Testbase {


	public static WebDriver driver;
	public static Properties prop;

	public Testbase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\laksh\\eclipse-workspace\\selenium_java_framework\\src\\main\\java\\com\\amazon\\qa\\config\\ config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}catch(IOException e) {
			e.printStackTrace();		

		}

	}


	public static void initialization() {

		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {

			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Testutil.implicit_wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
