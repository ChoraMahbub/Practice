package com.mhmpractice;

class Car {
	String name;
	float milage;
	int cost;
}

// Note: in call by reference, changes in any of the variables will affect the
// other
public class CallByReferenceDemo2 {

	public static void main(String[] args) {

		Car a = new Car(); // Creating an object
		a.name = "BMW";
		a.milage = 5.5f;
		a.cost = 50;
		System.out.println("Original Assignment of 'a'");
		System.out.println("The name of the Car for Variable 'a' is: " + a.name);
		System.out.println("The milage of the Car for Variable 'a' is: " + a.milage);
		System.out.println("The cost of the Car for Variable 'a' is: " + a.cost + "\n");

		Car b; // Creating a reference
		b = a; // Here b is getting the same address of a, not the values pointing to the same
				// object
		// One object can have more than one references

		System.out.println("When  b = a");
		System.out.println("The name of the Car for Variable 'b' is: " + b.name);
		System.out.println("The milage of the Car for Variable 'b' is: " + b.milage);
		System.out.println("The cost of the Car for Variable 'b' is: " + b.cost + "\n");

		b.name = "TOYOTA";
		b.milage = 10.00f;
		b.cost = 10;

		System.out.println("Value of 'b' when assignment of 'b' changed");
		System.out.println("The name of the Car for Variable 'b' is: " + a.name);
		System.out.println("The milage of the Car for Variable 'b' is: " + a.milage);
		System.out.println("The cost of the Car for Variable 'b' is: " + a.cost + "\n");

		System.out.println("Value of 'a' when assignment of 'b' changed");
		System.out.println("The name of the Car for Variable 'a' is: " + a.name);
		System.out.println("The milage of the Car for Variable 'a' is: " + a.milage);
		System.out.println("The cost of the Car for Variable 'a' is: " + a.cost + "\n");

		a.name = "RR";
		a.milage = 100f;
		a.cost = 1000;

		System.out.println("Value of 'a' when new assignment of 'a' ");
		System.out.println("The name of the Car for Variable 'a' is: " + a.name);
		System.out.println("The milage of the Car for Variable 'a' is: " + a.milage);
		System.out.println("The cost of the Car for Variable 'a' is: " + a.cost + "\n");

		System.out.println("Value of 'b' when new assignment of 'a'");
		System.out.println("The name of the Car for Variable 'b' is: " + a.name);
		System.out.println("The milage of the Car for Variable 'b' is: " + a.milage);
		System.out.println("The cost of the Car for Variable 'b' is: " + a.cost);
	}

}
