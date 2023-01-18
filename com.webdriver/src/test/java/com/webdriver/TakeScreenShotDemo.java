package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		Date currentdate = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String strDate = DateFor.format(currentdate);

		//String strDate = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(strDate);
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//ResultFiles//" +" ResultFile"  + strDate  +".png"));

	} 

}
