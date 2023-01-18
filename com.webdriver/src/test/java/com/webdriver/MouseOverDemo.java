package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//This Element is inside 2 nested shadow DOM.
		String cssSelectorForHost1 = "hgf-c360nav[locale='us']";
		String cssSelectorForHost2 = "hgf-c360login[aria-haspopup='true']";
		Thread.sleep(1000);
		//SearchContext shadow0 = driver.findElement(By.cssSelector("hgf-c360nav[locale='us']")).getShadowRoot();
		SearchContext shadow0 = driver.findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
		Thread.sleep(1000);
		//SearchContext shadow1 = shadow0.findElement(By.cssSelector("hgf-c360login[aria-haspopup='true']")).getShadowRoot();
		SearchContext shadow1 = shadow0.findElement(By.cssSelector(cssSelectorForHost2)).getShadowRoot();
		Thread.sleep(1000);
		
		//	CSS Selector     	hgf-popover > hgf-button > span:nth-child(2)
		//WebElement login = shadow1.findElement(By.cssSelector(" hgf-popover:nth-child(2) > hgf-button:nth-child(1) > span:nth-child(2)"));
		WebElement login = shadow1.findElement(By.cssSelector("hgf-popover > hgf-button > span:nth-child(2)"));
		System.out.println(login.getText());
		Actions action = new Actions(driver);
		action.moveToElement(login).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
