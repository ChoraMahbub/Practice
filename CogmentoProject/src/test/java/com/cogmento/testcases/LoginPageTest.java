package com.cogmento.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cogmento.base.BaseClass;
import com.cogmento.pageobjects.HomePage;
import com.cogmento.pageobjects.LoginPage;

public class LoginPageTest  extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public void loginTest() throws Throwable {
		homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	
	

}
