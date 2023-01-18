package com.mhmpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenElements2 {

	public static void main(String[] args) throws InterruptedException {

		// CASE: 2
		// The element is hidden and the element is destroyed in DOM
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/hotels");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dpdn = driver.findElement(By.xpath("//i[@class='icon icon-angle-right arrowpassengerBox']"));
		dpdn.click();

		WebElement addchild1 = driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[2]"));
		addchild1.click();
		Thread.sleep(2000);
		boolean ageChild = driver.findElement(By.xpath("//select[@class='ageselect']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Element is visible: " + ageChild);
		Thread.sleep(2000);

		WebElement minuschild = driver.findElement(By.xpath("(//span[@class='ddSpinnerMinus'])[2]"));
		minuschild.click();
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Showing null
		Object ageChild2 = jse.executeScript("document.getElementsByClassName('ageselect').toString()");
		// Throws error
		// boolean ageChild2 =
		// driver.findElement(By.xpath("//select[@class='ageselect']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Element is visible: " + ageChild2);

		driver.quit();
		// Web sites
		// http://training.openspan.com/login
		// https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp
		// https://www.yatra.com/hotels
		// https://courses.letskodeit.com/practice

	}

}
