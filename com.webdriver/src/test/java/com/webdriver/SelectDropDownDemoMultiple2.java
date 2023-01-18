package com.webdriver;

import java.awt.AWTException;
import java.awt.Button;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownDemoMultiple2 {

		public static void main(String[] aa) throws AWTException, InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://semantic-ui.com/modules/dropdown.html");
	         
	        Thread.sleep(3000);
	        
	        //scroll down the page
	        JavascriptExecutor jsexec = (JavascriptExecutor)driver;
	        //jsexec.executeScript("window.scrollBy(0,500)");
	        // scroll down to Multiple Search Selection dropdown 
			WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[9]/div"));
			jsexec.executeScript("arguments[0].scrollIntoView(true);", multiselect );
	       
			//Click on Multiple Search Selection Dropdown
			multiselect .click();
			// 
			List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[9]/div/div[2]/div"));
	        System.out.println(options.size());

	        for(int i = 0; i<=options.size()-1; i++) {
	        	String statename = options.get(i).getText();
	        	System.out.println( i + " State is : " + statename);    
	            //if((options.get(i).getText().equals("Arkansas")) || (options.get(i).getText().equals("Virginia"))) {
	            if((options.get(i).getText().contains("Arkansas")) || (options.get(i).getText().contains("Virginia"))) {	
	            	options.get(i).click();
	            	 continue;
	                }
	            } 
	        }        
		}
		
