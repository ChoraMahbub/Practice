package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Custom Message: Element not present")
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-cy = 'outsideModal']"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/span[contains(text(),'From')]"))).click();
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		//wait.until(ExpectedConditions.elementToBeClickable(from));
		from.click();
		from.sendKeys("IAD");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/p[contains(text(),'United States')]")));
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/span[contains(text(),'To')]"))).click();
		//driver.findElement(By.xpath("//*/span[contains(text(),'To')]")).click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder = 'To']"));
		//wait.until(ExpectedConditions.elementToBeClickable(to));
		to.click();
		to.sendKeys("Dhaka");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/p[contains(text(),'Bangladesh')]")));
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[(text()='Travellers & CLASS')]"))).click();
		//driver.findElement(By.xpath("//span[(text()='Travellers & CLASS')]")).click();
		driver.findElement(By.xpath("//li[(text()='First Class')]")).click();
		driver.findElement(By.xpath("//button[(text()='APPLY')]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[(text()='DEPARTURE')]"))).click();
		//driver.findElement(By.xpath("//span[(text()='DEPARTURE')]")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@aria-label='Tue Jan 31 2023']"))).click();
		//driver.findElement(By.xpath("//div[@aria-label='Tue Jan 31 2023']")).click();

		driver.findElement(By.xpath("//a[(text()='Search')]")).click();
		
		// Checking the Airport 
		//driver.findElement(By.xpath("//span[(text()='Dulles Intl-DC')]")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[(text()='Dulles Intl-DC')]"))).click();
	
		driver.close();
	}

}
