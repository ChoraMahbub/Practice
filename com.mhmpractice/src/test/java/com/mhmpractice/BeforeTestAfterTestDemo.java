package com.mhmpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeTestAfterTestDemo {

	public String baseUrl = "https://www.browserstack.com/";
	// String driverPath = "D:\\SWs\\Drivers\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.out.println("launching Chrome browser");
		// System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(3000);
	}

	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}

}
