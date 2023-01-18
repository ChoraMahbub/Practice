package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		
		// 	Print the title of the page
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		//	Click button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	
		//	highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid green'", button);
		Thread.sleep(2000);
		
		// Scroll to Learn How To
		driver.navigate().to("https://www.w3schools.com/");
		WebElement learnbutton = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);", learnbutton);
		
		
	}

}
