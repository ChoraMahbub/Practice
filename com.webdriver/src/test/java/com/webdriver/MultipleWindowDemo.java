package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		//  Moving to the following element  'Dice is the leading career destination .....'
		WebElement moveTo = driver.findElement(By.xpath("//div/p[(text()='Dice is the leading career destination for tech experts at every stage of their careers.')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(moveTo);
		actions.perform();
		Thread.sleep(2000);
		
		WebElement readReport = driver.findElement(By.xpath("//*/a[@aria-label='Read the Report about 1H Tech Job Report']"));
		//driver.findElement(By.xpath("//*/a[@aria-label='Read the Report about 1H Tech Job Report']")).click();
		readReport.click();
		Thread.sleep(2000);

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> iter = s.iterator();

		while(iter.hasNext()) {
		String child_window = iter.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		driver.close();
		}	
	}
		//switch to the parent window
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.close();
		}

}
