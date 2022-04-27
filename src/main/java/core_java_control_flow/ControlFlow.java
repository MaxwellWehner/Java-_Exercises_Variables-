package core_java_control_flow;

public class ControlFlow {

	public static void main(String[] args) {
		// problem 1
//		prob1(7);
//		prob1(15);

		// problem 2
//		prob2(7);
//		prob2(15);

		// problem 3
		prob3(15);
		prob3(50);
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
}
