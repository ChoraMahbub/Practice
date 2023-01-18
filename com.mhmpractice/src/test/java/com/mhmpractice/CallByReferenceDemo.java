package com.mhmpractice;

public class CallByReferenceDemo {

	int data = 50;

	public void change(CallByReferenceDemo op) {
		op.data = op.data + 100; // changes will be in the instance variable
	}

	public static void main(String[] args) {

		CallByReferenceDemo op = new CallByReferenceDemo();

		System.out.println("Before change " + op.data);
		op.change(op); // passing object
		System.out.println("After change " + op.data);

	}

}
