package com.mhmpractice;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertDemo {

	public static void main(String[] args) {
		

	}
		
		@Test
		private void softAssert() {
		
			SoftAssert softAssert = new SoftAssert();
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver =  new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://www.browserstack.com/");
			Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
			Boolean verifyTitle2 = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack2");
			Boolean verifyTitle3 = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack3");
			Boolean bol = null;
	
			softAssert.assertEquals(verifyTitle, verifyTitle2);
		
		    softAssert.assertNotEquals(verifyTitle, verifyTitle2);
		
		    softAssert.assertTrue(verifyTitle);
		
		    softAssert.assertFalse(verifyTitle3);
		
		    softAssert.assertNotNull(verifyTitle);
		
		    softAssert.assertNull(bol);
		
		    softAssert.assertAll();
		    
			driver.close();
	
}
}
