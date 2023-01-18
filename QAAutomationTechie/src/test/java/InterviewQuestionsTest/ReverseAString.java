package InterviewQuestionsTest;

import org.testng.annotations.Test;

public class ReverseAString {
	// ==============================================================================
	@Test(priority=1, description="First Logic" )
	public void logic1() {
		System.out.println("Running First Logic");
		String  str1 = "ABCD";
		String rev1 = "";
		System.out.println("Before reversing: "+ str1);
		//	Logic 1: Using + (string concatenation) operator
		int len1 = str1.length();
		for (int i=len1-1; i>=0; i--)
		{
			rev1=rev1+str1.charAt(i);
			System.out.println("rev is: "+ rev1);
		}
		System.out.println("After reversing: " + rev1);
}
	//===========================================================================
	@Test(priority=2, description="Second Logic" )
	public void logic2() {
		System.out.println("Running Second Logic");
		String  str2 = "DEFG";
		String rev2 = "";
		System.out.println("Before reversing: "+ str2);
		//	Logic 2: Using character array
		char a[]=str2.toCharArray();
		int len2 = a.length;
		for (int i=len2-1; i>=0; i--)
		{
			//rev2=rev2+str2.charAt(i);
			rev2 = rev2+a[i];
			System.out.println("rev is: "+ rev2);
		}
		System.out.println("After reversing: " + rev2);
		
}
	// ============================================================================
	@Test(priority=3, description="Third Logic" )
	public void logic3() {
		System.out.println("Running Third Logic");
		String  str3 = "HIJK";
		System.out.println("Before reversing: "+ str3);
		//	Logic 3: Using string buffer class
		
		StringBuffer sb = new StringBuffer(str3);
		
		System.out.println("After reversing: " + sb.reverse());
		
	}
	
}
