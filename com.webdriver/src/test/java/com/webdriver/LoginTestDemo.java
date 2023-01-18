package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// By CSS Selector
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		 Thread.sleep(3000);
		// Add logout
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 Thread.sleep(3000);		 
		 driver.findElement(By.id("logout_sidebar_link")).click();
		 Thread.sleep(3000);
		 driver.close();

	}

}
