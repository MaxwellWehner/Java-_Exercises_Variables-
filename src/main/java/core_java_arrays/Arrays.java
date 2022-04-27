package core_java_arrays;

public class Arrays {

	public static void main(String args[]) {
//		prob1();
//		prob2();
		prob3();
	}

	static void prob1() {
		int nums[] = { 1, 2, 3 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	static void prob2() {
		int nums[] = { 13, 5, 7, 68, 2 };
		System.out.println(nums[(int) Math.floor(nums.length / 2)]);
	}

	static void prob3() {
		String strs[] = { "red", "green", "blue", "yellow" };
		System.out.println(strs.length);
		String copy[] = strs.clone();
		System.out.println(java.util.Arrays.toString(copy));
	}
}
