package InterviewQuestionsTest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureToolTip {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://grants.gov");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		
		System.out.println("Login text is: " + login.getText());
		Actions action = new Actions(driver);
		action.moveToElement(login).perform();
		// Using getDomAttribute
		String toolTipText1 = login.getDomAttribute("title");
		// Using getAttribute
		String toolTipText2 = login.getAttribute("title");
		System.out.println("Login tooltip 1 text is: "+ toolTipText1);
		System.out.println("Login tooltip 2 text is: "+ toolTipText2);
		Thread.sleep(2000);
		
		// Using linkText to find element
		WebElement ele1 = driver.findElement(By.linkText("Get Adobe Reader"));
		// moving to the element
		new Actions(driver).moveToElement(ele1).perform();
		Thread.sleep(5000);
		String toolTipText3 = ele1.getAttribute("title");
		System.out.println("Login tooltip 3 text is: "+ toolTipText3);
		
		// Using partialLinkText to find element
		WebElement ele2 = driver.findElement(By.partialLinkText("Adobe Reader"));
		String toolTipText4 = ele2.getAttribute("title");
		System.out.println("Login tooltip 4 text is: "+ toolTipText4);
		
		// Total number of links present in the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println("Number of links is: "+ totalLinks);
		
		// Taking screenshot
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(userDir  + "/ScreenShots/testScreenShot.jpg"));
		
		driver.quit();
	}

}
