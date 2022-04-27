package core_java_loops;

public class Loops {

	public static void main(String[] args) {
		prob1();
		prob2();
		prob3();
	}

	static void prob1() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}

	static void prob2() {
		for (int i = 0; i < 110; i += 10) {
			System.out.println(i);
		}
	}

	static void prob3() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 11);
	}
}
