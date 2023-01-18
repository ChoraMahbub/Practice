package com.webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		
		//	Reading from properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\JHUMA\\Desktop\\AutomationPractice\\WebDriver\\com.webdriver\\src\\test\\resources\\properties\\testdata.properties");
		
		properties.load(fis);
		System.out.println(properties.getProperty("cbrowser"));
		System.out.println(properties.getProperty("url"));
		
		//	Writing to properties file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\JHUMA\\Desktop\\AutomationPractice\\WebDriver\\com.webdriver\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("UserName", "TestUser");
		properties.store(fos, "This is test");
		
	}

}
