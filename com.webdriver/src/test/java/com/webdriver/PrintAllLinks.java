package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags  = driver.findElements(By.tagName("a"));
		//List<WebElement> alltags  = driver.findElementsbyTagName("a");  		// does not work
		System.out.println("Total tags are: " + alltags.size());
		
		for (int i = 0; i < alltags.size(); i++) {
			System.out.println("Link is: " + alltags.get(i).getAttribute("text"));		// visible text
			System.out.println("Link is: " + alltags.get(i).getAttribute("href") + "\n");		// URL
			
		}
	
		//driver.close();
		
		
		
		
		

		
		//driver.close();

	}

}
