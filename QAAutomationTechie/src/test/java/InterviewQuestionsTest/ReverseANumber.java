package InterviewQuestionsTest;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseANumber {
	// ==============================================================================
	@Test(priority=1, description="First Logic" )
	public void logic1() {
		System.out.println("Running First Logic");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1 = sc.nextInt();
		System.out.println("Before reversing: "+ num1);
		//	Logic 1: Using algorithm
		int rev1 = 0;
		while(num1!=0)
		{
			//	Say rev=1234
			rev1=rev1*10 + num1%10;   // 0+1234%10 = 4		40+3=43		430+2=432		4320+1=4321
			num1 = num1/10;				// 1234/10=123		123/10=12			10/10=1			1/10=0
			
			System.out.println("rev is: "+ rev1);
			System.out.println("num is: "+ num1);
		}
		System.out.println("After reversing: " + rev1);
}
	//===========================================================================
	@Test(priority=2, description="Second Logic" )
	public void logic2() {
		System.out.println("Running Second Logic");
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num2 = sc2.nextInt();
		System.out.println("Before reversing: "+ num2);
		//	Logic 2: Using StringBuffer class
		StringBuffer rev2;
		StringBuffer sb2 = new StringBuffer(String.valueOf(num2));
		rev2 = sb2.reverse();
		System.out.println("After reversing: " + rev2);
}
	// ============================================================================
	@Test(priority=3, description="Third Logic" )
	public void logic3() {
		System.out.println("Running Second Logic");
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num3 = sc3.nextInt();
		System.out.println("Before reversing: "+ num3);
		
		//	Logic 2: Using StringBuilder class
//		StringBuilder rev3;		
//		StringBuilder sbl3 = new StringBuilder(String.valueOf(num3));
//		rev3 = sbl3.reverse();
//		System.out.println("After reversing: " + rev3);
		
		// Different way
		StringBuilder sbl3 = new StringBuilder();
		sbl3.append(num3);
		StringBuilder rev3 = sbl3.reverse();
		System.out.println("After reversing: " + rev3);

	}
	
}
