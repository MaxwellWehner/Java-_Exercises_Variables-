package core_java_operators_numbers;

public class OperatorsAndNumbers {

	public static void main(String[] args) {
		// problem 1
		// a) 1
		// b) 1000
		// c) 100001
		// d) 1001110
		// e) 1100010011
		// f) 1000010011000011

		// problem 2
		// a) 2
		// b) 9
		// c) 52
		// d) 114
		// e) 543
		// f) 11367

		// problem 3
		prob3(2);
		prob3(9);
		prob3(17);
		prob3(88);

		// problem 4
		prob4(150);
		prob4(225);
		prob4(1555);
		prob4(32456);

		prob5();
		prob6();
		prob7();
		prob8();
	}

	static void prob3(int x) {
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// Multiples the num i by 2
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
	}

	static void prob4(int x) {
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
	}

	static void prob5() {
		int x = 7;
		int y = 17;
		int z;

		z = x & y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		z = x | y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
	}

	static void prob6() {
		int x = 5;
		System.out.println(x);
		x++;
		System.out.println(x);
	}

	static void prob7() {
		int x = 1;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
	}

	static void prob8() {
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println(sum);
		sum = x++ + y;
		System.out.println(sum);
	}

}
