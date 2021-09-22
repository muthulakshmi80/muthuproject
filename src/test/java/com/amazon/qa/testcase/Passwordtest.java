package com.amazon.qa.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.Testbase;
import com.amazon.qa.pages.Homeandkitchen;

import com.amazon.qa.pages.Juicerpage_clone;
import com.amazon.qa.pages.Passwordpage;

import com.amazon.qa.pages.Today_deal;
import com.amazon.qa.pages.Userpage;
import com.amazon.qa.pages.homepage;
import com.amazon.qa.pages.login;


/*public class Passwordtest extends Testbase {
	login login;
	Passwordpage pass;
	homepage homep;


	public Passwordtest() {	
		super();
	}//method of homepage test

	@BeforeMethod
	public void setup() {
		initialization();
		homep = new homepage();
		//homep.signin();
		login = new login();
		//login.signin(prop.getProperty("username"));
		pass = new Passwordpage();
	}

	@Test(priority =1)
	public void home() {
		login = homep.signin();
	}

	@Test (priority =2)
	public void login() {
			homep.signin();
		login.signin(prop.getProperty("username"));
	}



	@Test(priority =3)
	public void loginpass() {
			homep.signin();
			login.signin(prop.getProperty("username"));
		    pass.signin(prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {

		driver.quit();

	}



}*/

//*********************************************






public class Passwordtest extends Testbase {
	login login;
	Passwordpage pass;
	homepage homep;
	Today_deal tdeal;
	Homeandkitchen homekit;
	Juicerpage_clone juicer;
	
	

	public Passwordtest() {	
		super();
	}//method of homepage test

	@BeforeMethod
	public void setup() {
		initialization();
		homep = new homepage();
		homep.signin();
		login = new login();
		login.signin(prop.getProperty("username"));
		 pass = new Passwordpage();
		 tdeal = new Today_deal();
		 homekit = new Homeandkitchen();
		 juicer = new Juicerpage_clone();
		 
		 
	}

	/*@Test(priority =1)
	public void loginpass() {
		
		pass.signin(prop.getProperty("password"));
		System.out.println("successfully logged in"+driver.getTitle());
		System.out.println("username"+prop.getProperty("username"));		
		
		
	}*/
	

	/*@Test(priority =2)
	public void validuser() {
		pass.signin(prop.getProperty("password"));
			
		Assert.assertTrue(userp.verifyhomepageuser());
		System.out.print("username"+prop.getProperty("username"));
	
	}*/
	

	/*@Test(priority =2)
	public void todaydeal() {
		pass.signin(prop.getProperty("password"));
		tdeal.todaydeal();
		System.out.println("title of the page"+driver.getTitle());
		
	//	Assert.assertEquals("All Available",tdeal.allavail());
		//System.out.print("clicked all available deals" );
		
	}*/
	
	
	@Test(priority =1)
	public void homekitchen() {
		pass.signin(prop.getProperty("password"));
		homekit.homekit();
		System.out.println("title of the page"+driver.getTitle());
		
		homekit.selectjuicer();
		System.out.println("title of the page"+driver.getTitle());
		
		juicer.juicerpageclick();
		System.out.println("title of the page"+driver.getTitle());
		
		juicer.selectjuicertype();
		System.out.println("title of the page"+driver.getTitle());

		juicer.brand();
		System.out.println("title of the page"+driver.getTitle());
		
		juicer.price();
		juicer.pod();
		juicer.itemcondition();
		juicer.discount();
		juicer.selpro();
		juicer.addcart();
		
		
		//juicer.juicermodel();
		//System.out.println("title of the page"+driver.getTitle());
		
		//assert.asserttruejuicer.juicerpageclick();
		
		
	//	Assert.assertEquals("All Available",tdeal.allavail());
		//System.out.print("clicked all available deals" );
		
	}
	
	
/*	@Test(priority =4)
	public void allavail() {
		pass.signin(prop.getProperty("password"));
		tdeal.allavail();
		System.out.print("title of the page"+driver.getTitle());
		
	}*/


	
	
	
	/*@AfterMethod
	public void teardown() {

		driver.quit();

    }*/



}



