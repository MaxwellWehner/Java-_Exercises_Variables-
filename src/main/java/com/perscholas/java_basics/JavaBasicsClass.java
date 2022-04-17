package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		prob1();
		prob2();
		prob3();
		prob4();
	}
	
	public static void prob1() {
		int a = 5;
		int b = 7;
		int sum = a + b;
		System.out.println(sum);
	}
	
	public static void prob2() {
		double a = 3.3;
		double b = 3.6;
		double sum = a + b;
		System.out.println(sum);
	}
	
	public static void prob3() {
		int a = 5;
		double b = 3.6;
		double sum = a + b;
		System.out.println(sum);
		//Sum must be a double or it wont work
	}
	
	public static void prob4() {
		double a = 5;
		int b = 3;
		double sum = a / b;
		System.out.println(sum);
		//If sum is an int it will do int division and return a whole number
		//when a was changed to a dec sum also needed to be changes to dec and then division was possible with decimals
	}

}
