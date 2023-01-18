package com.mhmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {

	WebDriver driver;

	@BeforeTest
	void setup() {

		System.setProperty("webdriver.chrome.driver", "D://SWs/Drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://127.0.0.1:1080/WebTours/index.htm");

	}

	@Test(dataProvider = "users")
	void loginTest(String uname, String pwd) throws InterruptedException {
		driver.get("http://127.0.0.1:1080/WebTours/index.htm");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(5000);
	}

	@DataProvider(name = "users")
	Object[][] logindata() {
		// String data[ ][ ] = (("uname" , "jojo"), ("jojo1", "bean1"));
		// Create object array with 2 rows and 2 column- first parameter is row and
		// second is //column
		Object[][] data = new Object[2][2];
		// Enter data to row 0 column 0
		data[0][0] = "jojo";
		// Enter data to row 0 column 1
		data[0][1] = "bean";
		// Enter data to row 1 column 0
		data[1][0] = "jojo1";
		// Enter data to row 1 column 0
		data[1][1] = "bean1";
		// return arrayobject to testscript
		return data;
	}

	@AfterTest
	void closebrowser() {
		driver.quit();
	}

}
