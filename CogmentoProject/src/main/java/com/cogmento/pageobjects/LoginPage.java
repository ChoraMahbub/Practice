/**
 * 
 */
package com.cogmento.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cogmento.actiondriver.Action;
import com.cogmento.base.BaseClass;

/**
 * @author Mahbub Mir
 *
 */
public class LoginPage  extends BaseClass {
	
	@FindBy(xpath = "//input[@placeholder='Email address']")
	WebElement emailtxtbox;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordtxtbox;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement signinbtn;
	
	@FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
	WebElement forgotpwdlnk;
	
	@FindBy(xpath = "//a[normalize-space()='Classic CRM']")
	WebElement classicCRMlnk;
	
	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	WebElement signUplnk;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String username, String password ) throws Throwable {
		Action.scrollByVisibilityOfElement(driver, emailtxtbox);
		Action.type(emailtxtbox, username);
		Action.type(passwordtxtbox, password);
		Action.click(driver, signinbtn);
		Thread.sleep(2000);
		return new HomePage();
	}
	
	

}
