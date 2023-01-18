package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllRadioButtons {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-cy = 'outsideModal']")).click();
		Thread.sleep(2000);
	
//		Ctrl + /    to comment out the block

		List<WebElement> rbuttons  = driver.findElements(By.xpath("//*/ul[@class='fswTabs latoBlack greyText']/li"));
		System.out.println("Total Radio Buttons are: " +rbuttons.size());
		
		for (int i = 0; i < rbuttons.size(); i++) {
			System.out.println("Radio Button is: " + rbuttons.get(i).getText());		// display value
			if ( rbuttons.get(i).getAttribute("class").equals("selected")) {
				//System.out.println("Radio Buttons is: " +rbuttons.get(i).isSelected());
			    //System.out.println("Radio Button " + rbuttons.get(i).getText() + " is " + rbuttons.get(i).getAttribute("class"));
				System.out.println("Radio Button " + rbuttons.get(i).getText() + " is selected.");
			}
			else {
				System.out.println("Radio Button " + rbuttons.get(i).getText() + " is not selected.");
			}
		}

	}

}
