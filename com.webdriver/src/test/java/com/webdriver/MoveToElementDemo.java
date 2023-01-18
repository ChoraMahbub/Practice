package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-cy = 'outsideModal']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[(text()='Search')]")).click();
		Thread.sleep(5000);
		
		//  Moving to the following element  'Layover Airports'
		WebElement label = driver.findElement(By.xpath("//div/p[(text()='Layover Airports')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(label);
		actions.perform();
		
	}

}
