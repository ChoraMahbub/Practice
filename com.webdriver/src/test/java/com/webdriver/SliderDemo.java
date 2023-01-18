package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Slider']")).click();
	
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		//WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Thread.sleep(2000);
		
		//slider.click();
		//Thread.sleep(2000);
		Actions actions = new Actions(driver);
		//actions.dragAndDropBy(slider, 400, 15).perform();		
		// Code in two lines
		actions.dragAndDropBy(slider, 400, 15);
		actions.perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
