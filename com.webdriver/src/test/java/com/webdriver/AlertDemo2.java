package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.ebay.com/");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// switching to child frame 1
		WebElement iframe = driver.findElement(By.xpath("//*[@id='iframeResult']"));
		//driver.switchTo().frame(1);												// By iframe index
		//driver.switchTo().frame("iframeResult");						// By iframe id
		driver.switchTo().frame(iframe);										// By iframe WebElement
		System.out.println(driver.getTitle());									// Getting the window title
		Thread.sleep(2000);
		// Clicking the Try it button
		driver.findElement(By.xpath("/html/body/button")).click();
		// Getting the text of the alert
		System.out.println(driver.switchTo().alert().getText());
		
//		Thread.sleep(2000);
//		driver.switchTo( ).alert( ).sendKeys("Mahbub Mir");
//		Thread.sleep(5000);
//		// Accepting the alert
//		driver.switchTo( ).alert( ).accept();
//		Using Alert		===============
		Alert alert = driver.switchTo( ).alert( );
		alert.sendKeys("Mahbub Mir");
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//*[@id='demo']")).getText());
		
		// switching to parent frame
		driver.switchTo( ).parentFrame();
		System.out.println(driver.getTitle());								// Getting the window title
		Thread.sleep(2000);
		driver.quit();
		}
}
