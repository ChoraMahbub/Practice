package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdownDemo {

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
	
		
		//	XPath
		//span[(text()='From')]
		//*/span[contains(text(),'From')]
		driver.findElement(By.xpath("//*/span[contains(text(),'From')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Virginia");
		//Thread.sleep(2000);
		//  Selecting the first item
		//driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		from.sendKeys("Virginia");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//*/span[contains(text(),'From')]")).click();
		//from.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New York");
		//from.sendKeys("New York");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//div/p[@class=\"font14 appendBottom5 blackText\"]"));
		
        System.out.println(allOptions.size());
        
		for (int i = 0; i < allOptions.size(); i++) {
			
			//String option = allOptions.get(i).getText();
		    //System.out.println("Option content is : " + option);
			
			//System.out.println("Option is: " + allOptions.get(i).getAttribute("text"));   //  does not work
			System.out.println("Option is: " + allOptions.get(i).getText());
			
            if(allOptions.get(i).getText().contains("Niagara Falls")) {
                
                allOptions.get(i).click();
                break;
                 
            }

		}
   
   }
		
}

