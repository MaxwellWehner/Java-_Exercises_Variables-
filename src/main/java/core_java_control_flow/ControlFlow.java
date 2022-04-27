package core_java_control_flow;

public class ControlFlow {

	public static void main(String[] args) {
		// problem 1
//		prob1(7);
//		prob1(15);

		// problem 1
		prob2(7);
		prob2(15);
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
}
