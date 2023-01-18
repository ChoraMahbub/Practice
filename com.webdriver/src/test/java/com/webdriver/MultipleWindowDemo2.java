package com.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowDemo2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		//	CSS Selector
		// header > div > div.c360-nav__wrapper > nav.utility-nav > div > hgf-button		
	
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "hgf-c360nav[locale='us']";
		Thread.sleep(1000);
		//SearchContext shadow = driver.findElement(By.cssSelector("hgf-c360nav[locale='us']")).getShadowRoot();
		SearchContext shadow = driver.findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
		Thread.sleep(1000);
		//shadow.findElement(By.cssSelector(" header:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(4) > div:nth-child(2) > hgf-button:nth-child(1)")).click();
		WebElement tryFree = shadow.findElement(By.cssSelector("header > div > div.c360-nav__wrapper > nav.utility-nav > div > hgf-button"));
		//shadow.findElement(By.cssSelector("header > div > div.c360-nav__wrapper > nav.utility-nav > div > hgf-button")).click();
		tryFree.click();
		Thread.sleep(2000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@name='UserFirstName']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"UserLastName\"]")).sendKeys("User");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"UserTitle\"]")).sendKeys("Student");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/span[(text()='Next')]")).click();
		Thread.sleep(2000);
		driver.close();		// Close current window
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		driver.close();		// Close current window
		
		
		
		
}
}