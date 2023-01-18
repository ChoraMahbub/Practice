package com.webdriver;

public class VariablesDemo {
	
	int j = 20;		// instance variable
	static int k = 20;	
	
	public static void main(String[] args) {
		
		int myNumber = 15;		// local variable
		int secondNumber = 30;
		char ch = 'A';
		String str1 = "Test";
		// If you want to use variable j here, you have to create an object or declare it as static, static int j = 20;	
			//System.out.println(j);	 // Will throw error
			
			System.out.println("The value of variable k  is " +k);
			
			System.out.println(myNumber + secondNumber);
			
			System.out.println(myNumber + secondNumber + str1 );
			
			System.out.println(str1 + myNumber + secondNumber  );
			
			
	}
	
	public void myMethod() {
		int i = 20;
		
	}

}
