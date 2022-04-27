package core_java_control_flow;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// problem 1
		prob1(7);
		prob1(15);

		// problem 2
		prob2(7);
		prob2(15);

		// problem 3
		prob3(15);
		prob3(50);

		// problem 4
		prob4(15);
		prob4(5);

		prob5();
		prob6();
	}

	static void prob1(int x) {
		if (x < 10) {
			System.out.println("Less than 10");
		}
	}

	static void prob2(int x) {
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10) {
			System.out.println("Greater than 10");
		}
	}

	static void prob3(int x) {
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else if (x >= 20) {
			System.out.println("Greater than or equal to 20");
		}
	}

	static void prob4(int x) {
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		} else if (x >= 10 && x <= 20) {
			System.out.println("In range");
		}
	}

	static void prob5() {
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("B");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("C");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("D");
		} else if (grade >= 0 && grade < 60) {
			System.out.println("F");
		} else {
			System.out.println("Score out of range");
		}
		input.close();
	}
	
	static void prob6() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(num >= 1 && num <= 7) {
			switch(num) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			}
		}else {
			System.out.println("Out of range");
		}
	}
}
