package com.webdriver;

public class OperatorsJavaDemo {

	public static void main(String[] args) {
		
		String str1 = "Operators Demo";
		String str2 = "Operators Demo";
		int number1 = 10;
		int number2 = 20;
		
		System.out.println("Number1 is: " + number1 );
		System.out.println("Number2 is: " + number2 );
		number1++;

		System.out.println("New Number1 after ++ operator is: " + number1 );
		
		number1--;
		System.out.println("New Number1 after -- operator is: " + number1 );
		
		boolean bool1 = true;
		System.out.println("Boolean variable is: " + bool1 );
		
		boolean bool2 = !true;
		System.out.println("Boolean variable after !true is: " + bool2 );
		
		// == operator for integers comparison
		if (number1 == number2) {
			System.out.println("Condition is true for ==" );
		}
		else {
			System.out.println("Condition is true for ==" );
		}
		
		if (number1 != number2) {
			System.out.println("Condition is true for !=" );
		}
		else {
			System.out.println("Condition is not true for !=" );
		}
			
		// equals for string compare
			
		if (str1.equals(str2)){
			System.out.println("Strings are same" );
		}
		else {
			System.out.println("Strings are not same" );
		}
		// both number values are true
		if ( (number1 == 10 ) && (number2 == 20 )) {
			System.out.println("Condition is true for && " );
		}
		else {
			System.out.println("Condition is not true for &&" );
		}
		// one of the number value is true
		if ( (number1 == 10 ) || (number2 == 30 )) {
			System.out.println("Condition is true for  || " );
		}
		else {
			System.out.println("Condition is not true for || " );
		}	
		
	}

}
