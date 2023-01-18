/**
 * 
 */
		package com.cogmento.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.cogmento.actiondriver.Action;

//import com.cogmento.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
		 * @author Mahbub Mir
		 *
		 */
		public class BaseClass {
			
			public static Properties prop;
			public static WebDriver driver;
			
		//@BeforeTest
		public void loadConfig() {
			
			try {
				Properties prop = new Properties();
				
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\config.properties" );
				prop.load(ip);
				String URL = prop.getProperty("url");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
			public static void launchApp() {
				//WebDriverManager.chromedriver().setup();
				String browserName = prop.getProperty("browser");
				if (browserName.contains("Chrome")) {
					driver= new ChromeDriver();
				} else if (browserName.contains("FireFox")) {
					driver= new FirefoxDriver();
				} else if (browserName.contains("Edge")) {
					driver= new EdgeDriver();
			}
				// All methods in Action class are static, 
				Action.implicitWait(driver, 10);
				Action.pageLoadTimeOut(driver, 30);
				//driver.get(prop.getProperty("url"));
				driver.get("URL");
				//driver.get(URL);
				
			
		}
	}
