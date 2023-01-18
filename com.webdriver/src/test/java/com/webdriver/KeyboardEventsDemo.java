package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsDemo {

	@Test
	//public static void main(String[] args) throws InterruptedException {
	public void keyboardEventsDemo() throws InterruptedException {			// for using TestNG

		//selenium.dev/selenium/docs/api/java/index.html
		
		WebDriverManager.edgedriver().setup();
		//EdgeDriver driver = new EdgeDriver();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.extendsclass.com/text-compare.html");
		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/div[1]/pre/span"));
		WebElement desttextarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[3]/pre/span"));
		
		Actions action = new Actions(driver);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		action.keyDown(desttextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);
		String exptext = "0 difference(s) between the two text documents";
		WebElement textdiff = driver.findElement(By.xpath("//div[@id='nb-diff']"));
		WebElement movetoelement = driver.findElement(By.xpath("//input[@value='Next diff']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(movetoelement).perform();
		Thread.sleep(2000);
		String actualtext = textdiff.getText();
		System.out.println("The actual text is :" + actualtext);
		Assert.assertEquals(exptext, actualtext);
		Thread.sleep(2000);
		driver.close();
	}

}
