package com.mhmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBackForwardDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		// Maximize the browser
        driver.manage().window().maximize();
     // Launch Website
		driver.navigate().to("https://www.browserstack.com/");
		
		
		WebElement ftrial = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		
		ftrial.click();
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.navigate().forward();
		Thread.sleep(2000);
		

	}

}
