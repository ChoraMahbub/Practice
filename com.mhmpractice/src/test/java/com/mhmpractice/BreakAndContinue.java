package com.mhmpractice;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			if (i == 3) {
			
			break;
			
			}
			
			System.out.println("For break i is: " + i);
				
		}
		
		for (int j=1; j<=10; j++) {
			
			if (j == 3) {
	
			continue;
			
			}
			
			System.out.println("For continue j is: " + j);
				
		}

	}

}
