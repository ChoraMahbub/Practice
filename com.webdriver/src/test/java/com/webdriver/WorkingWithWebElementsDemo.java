package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("The page title is " +title);

		driver.findElement(By.name("username")).sendKeys("Test");
		String att = driver.findElement(By.name("username")).getAttribute("type");
		System.out.println("The attribute is " +att);
		
	}

}
