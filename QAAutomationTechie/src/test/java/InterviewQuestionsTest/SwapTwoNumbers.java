package InterviewQuestionsTest;
import org.testng.annotations.Test;

public class SwapTwoNumbers {

	//public static void main(String[] args) {
		
		@Test(priority=1, description="First Logic" )
		public void logic1() {
			System.out.println("Running First Logic");
			int a = 10, b = 20;
		System.out.println("Before swapping values are .. " + a +"     "+b);
		//	Logic 1 -  Third Variable
		int t=a;			// t = 10
		a=b;				// a = 20
		b=t;				// a = 10
		System.out.println("After swapping values are .. " + a +"     "+b);
	}
		
		@Test(priority=2, description="Second Logic" )
		public void logic2() {
			System.out.println("Running Second Logic");
			
			int a = 10, b = 20;
		System.out.println("Before swapping values are .. " + a +"     "+b);
		//	Logic 2 -  Without Third Variable
		// Using + addition and - subtraction
		a = a + b;		//10+20=30
		b = a - b;			//30-20=10
		a = a - b;			//30-10=20
		
		System.out.println("After swapping values are .. " + a +"     "+b);
	}
		
		@Test(priority=3, description="Third Logic" )
		public void logic3() {
			System.out.println("Running Third Logic");
			//	Logic 3 -  Without Third Variable
			// Using * multiplication and / division
			// Values of a and b should not be zero
			
			int a = 10, b = 20;
			
		System.out.println("Before swapping values are .. " + a +"     "+b);
		a = a*b;		//10*20=200
		b = a/b;		//200/20=10
		a = a/b;		//200/10=20
		
		System.out.println("After swapping values are .. " + a +"     "+b);
	}
		
		@Test(priority=4, description="Fourth Logic" )
		public void logic4() {
			System.out.println("Running Fourth Logic");
			//	Logic 4 -  Using Bitwise Converter   XOR (^)
			// www.easyonlineconverter.com/converters/bitwise-calculator.html
			// www.rapidtables.com/convert/number/binary-to-decimal.html
			// a=10			1010
			// b=20			10100
			//	a^b = 11110		= 30 	in binary number, if digit is same in the same position for both, then 1 else 0
			int a = 10, b = 20;
		System.out.println("Before swapping values are .. " + a +"     "+b);

		a = a^b;		//	10^20 = 30
		b = a^b;		//  30^20 = 10
		a = a^b;		//  30^10 = 20
		
		System.out.println("After swapping values are .. " + a +"     "+b);
	}
		
		@Test(priority=5, description="Fifth Logic" )
		public void logic5() {
			System.out.println("Running Fifth Logic");
			//	Logic 5 -  Using one statement
			
			int a = 10, b = 20;
			
		System.out.println("Before swapping values are .. " + a +"     "+b);

		b = a+b - (a=b);
		
		System.out.println("After swapping values are .. " + a +"     "+b);
	}
		
		
	}

