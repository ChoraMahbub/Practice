package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-cy = 'outsideModal']")).click();
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[2]/div[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*/span[contains(text(),'From')]")).click();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		from.sendKeys("IAD");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*/span[contains(text(),'To')]")).click();
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//input[@placeholder = 'To']"));
		to.sendKeys("Dhaka");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[(text()='Travellers & CLASS')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[(text()='First Class')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[(text()='APPLY')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[(text()='DEPARTURE')]")).click();
		Thread.sleep(10000);
		// selecting 7th day of the month from date picker
		//driver.findElement(By.xpath("(//div/p[(text()='7')])[1]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Jan 31 2023']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[(text()='Search')]")).click();
		Thread.sleep(5000);
		// Checking the Airport 
		driver.findElement(By.xpath("//span[(text()='Dulles Intl-DC')]")).click();
		Thread.sleep(2000);
		
		
	}

}
