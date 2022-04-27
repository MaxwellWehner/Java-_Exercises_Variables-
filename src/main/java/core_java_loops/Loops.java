package core_java_loops;

public class Loops {

	public static void main(String[] args) {
//		prob1();
//		prob2();
//		prob3();
//		prob4();
		prob5();
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
	
	static void prob4() {
		for(int i = 1; i < 101; i++) {
			if(i > 25 && i < 75) {
				continue;
			}
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	static void prob5() {
		for(int i = 1; i < 101; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			if(i > 50) {
				break;
			}
		}
	}
}
