package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		prob1();
		prob2();
		prob3();
		prob4();
		prob5();
		prob6();
		prob7();
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
		// Sum must be a double or it wont work
	}

	public static void prob4() {
		double a = 5;
		int b = 3;
		double ans = a / b;
		System.out.println(ans);
		// If ans is an int it will do int division and return a whole number
		// when a was changed to a dec ans also needed to be changes to dec and then
		// division was possible with decimals
	}

	public static void prob5() {
		double a = 99.5;
		double b = 45.4;
		double ans = a / b;
		System.out.println(ans);
		System.out.println((int) ans);
	}

	public static void prob6() {
		int x = 5;
		double y = 6;
		double q = y / x;
		System.out.println(q);
	}

	public static void prob7() {
		final double pi = 3.14;
		double area = 4 * 4 * pi;
		System.out.println(area);
	}

}
