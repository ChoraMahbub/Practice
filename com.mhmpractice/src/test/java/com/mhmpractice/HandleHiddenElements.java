package com.mhmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {

		// CASE: 1
		// The element is hidden but the element is in DOM
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		boolean ele1 = driver.findElement(By.xpath("//div[@id='myDIV']")).isDisplayed();
		System.out.println("Element is visible: " + ele1);

		WebElement btn = driver.findElement(By.xpath("//button[@class='ws-btn w3-hover-black w3-dark-grey']"));
		btn.click();
		boolean ele2 = driver.findElement(By.xpath("//div[@id='myDIV']")).isDisplayed();
		System.out.println("Element is visible: " + ele2);

		driver.quit();
		// Web sites
		// http://training.openspan.com/login
		// https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp
		// https://www.yatra.com/hotels

	}

}
