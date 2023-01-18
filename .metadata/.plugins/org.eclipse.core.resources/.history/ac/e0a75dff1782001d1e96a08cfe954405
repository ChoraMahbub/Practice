package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDynamicTablesDemo2 {
	
	public static void main(String[] args) {

	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	  // Locate table
	  WebElement mytable = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody"));

	  // Locate rows of table and save locators of each row in a list
	  List <WebElement>  rows_table = mytable.findElements(By.tagName("tr"));

	  // Get no. of rows in table
	  int rows_count = rows_table.size();

	  // Loop will execute till the last row of table
	  for (int row=0; row<rows_count; row++) 
	  {
	    // locate columns(cells) of that specific row.
	    List <WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));

	    // Get no. of columns(cells) In that specific row.
	   int columns_count = Columns_row.size();

	   System.out.println("Number of cells In Row "+row+" are "+columns_count);

	   // Loop will execute till the last cell of that specific row.
	   for (int column=0; column< columns_count; column++) {

	  // Retrieve text from that specific cell.
	  String celtext = Columns_row.get(column).getText();

	  System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext);
	   }
	  }
	 }

}
