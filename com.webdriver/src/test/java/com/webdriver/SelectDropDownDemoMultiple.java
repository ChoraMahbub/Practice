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

public class SelectDropDownDemoMultiple {

		public static void main(String[] aa) throws AWTException, InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	        driver.get("https://semantic-ui.com/modules/dropdown.html");
	        driver.manage().window().maximize();
	         
	        Thread.sleep(3000);
	        //scroll down the page
	         
	        JavascriptExecutor jsexec = (JavascriptExecutor)driver;
	        //jsexec.executeScript("window.scrollBy(0,500)");
	        // scroll down to Multiple Search Selection dropdown 
			WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[9]/div"));
			jsexec.executeScript("arguments[0].scrollIntoView(true);", multiselect );
	         
	        //Click on Multiple Search Selection Dropdown
			multiselect .click();
	           ///   NOT DONE ++++++++++++++++++++++++++++++
	        final String[] textOptions = {"Arkansas", "Virginia"};
	        final WebElement element = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[9]/div/div[2]/div"));
	        final Select dropdown = new Select(element);
	        final List<WebElement> options = dropdown.getOptions();
	        System.out.println(options.size());
	        final Actions builder = new Actions(driver);
	        final boolean isMultiple = dropdown.isMultiple();
	        if (isMultiple) {
	            dropdown.deselectAll();
	        }
	        builder.keyDown(Keys.CONTROL);
	        for (String textOption : textOptions) {
	            for (WebElement option : options) {
	                final String optionText = option.getText().trim();
	                if (optionText.equalsIgnoreCase(textOption)) {
	                    if (isMultiple) {
	                        if (!option.isSelected()) {
	                            builder.click(option);
	                        }
	                    } else {
	                        option.click();
	                    }
	                    break;
	                }
	            }
	        }
	        builder.keyUp(Keys.CONTROL).build().perform();
	}
	 
}
