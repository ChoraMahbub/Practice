package com.webdriver;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int num01 = 10;
		int num02 = 20;
		
		if (num01 > num02) {
			System.out.println("Number 1 is greater than Number 2" );
		}
		else if  (num01 == num02){
			System.out.println("Number 1 is equal to Number 2" );
		}
		
		else if  (num01 < num02){
			System.out.println("Number 1 is less than Number 2" );
		} 
		else {
			System.out.println("In the final else block" );
		}

	}

}
