package testNGPractice;

import org.testng.annotations.Test;

// TestNG Tutorial #2 - How to Write Test Cases Using TestNG

public class LoginTest2 {
	// TestNG executes tests alphabetically
	// TestNG executes tests by priority

	
	//@Test
	//@Test(priority=1)
	@Test(priority=1, description="This is loginTest")
	public void loginTest() {
		
		System.out.println("Login is successful");
		
	}
	
	//@Test
	//@Test(priority=2)
	@Test(priority=1, description="This is logoutTest")
	public void logoutTest() {
		
		System.out.println("Logout is successful");
		
	}
	

}
