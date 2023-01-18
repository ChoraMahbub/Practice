package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-cy = 'outsideModal']")).click();
		Thread.sleep(2000);
	
//		Ctrl + /
		driver.findElement(By.xpath("//*/span[contains(text(),'From')]")).click();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		from.sendKeys("New York");   //   IAD		New York
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*/span[contains(text(),'To')]")).click();
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//input[@placeholder = 'To']"));
		to.sendKeys("New Delhi");	// Dhaka	New Delhi
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[(text()='Travellers & CLASS')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[(text()='Economy/Premium Economy')]")).click();		//  First Class		Economy/Premium Economy
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[(text()='APPLY')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[(text()='DEPARTURE')]")).click();
		Thread.sleep(10000);
		// selecting 24th day of the month from date picker
		driver.findElement(By.xpath("(//div/p[(text()='24')])[1]")).click();
		//driver.findElement(By.xpath("//div[@aria-label='Tue Jan 31 2023']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[(text()='Search')]")).click();
		Thread.sleep(20000);
		
		Boolean isPresent01 = driver.findElements(By.xpath("(//span[@class='linkText pointer'])[1]")).size() > 0;
		if (isPresent01 == true ) {
			System.out.println("Element present 1"); 
			driver.findElement(By.xpath("(//span[@class='linkText pointer'])[1]")).click();
			Thread.sleep(2000);
		}
			else {
				System.out.println("No element present 1");
				Thread.sleep(2000);
			}

		//Boolean isPresent02 = driver.findElements(By.xpath("(//span[@class='linkText pointer'])[2]")).size() > 0;
		if (driver.findElements(By.xpath("(//span[@class='linkText pointer'])[2]")).size() > 0) {
		//if (isPresent02 == true ) {
			System.out.println("Element present 2");
			driver.findElement(By.xpath("(//span[@class='linkText pointer'])[2]")).click();
			Thread.sleep(2000);
		}	
		else {
			System.out.println("No element present 2");
			Thread.sleep(2000);
		}

		List<WebElement> checkboxes  = driver.findElements(By.xpath("//span[@class='filterName']"));
		System.out.println("Total Checkboxes are: " + checkboxes .size());
		
		for (int i = 0; i < checkboxes.size(); i++) {
			System.out.println("Checkbox is: " + checkboxes.get(i).getAttribute("title"));		
			
		}

		
	}

}
