package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesDemo {

	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//List
		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowsize = rowelements.size();
		//System.out.println(rowelements.size());
		System.out.println("Number of rows: " + rowsize);
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[1]/th[1]
		List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		int columnsize = columnelements.size();
		//System.out.println(columnelements.size());
		System.out.println("Number of columns: " +  columnsize);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		for (int i=2; i<=rowsize; i++) {
			for (int j=1; j<=columnsize; j++) {
				String columntext = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i + "]/td["+ j + "]")).getText();
				
				//System.out.println("Column text of column " + i + "of row " + j+ " is: " +  columntext);
				//System.out.print(columntext + "\t" );
				System.out.print(columntext + "           " );
			}
			System.out.println();
		}
		
		driver.close();

	}

}
