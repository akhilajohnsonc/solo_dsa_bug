package com.array;
//n+(n+1)/2
public class missing_number {
	public static void main(String[] args) {
		missing_number mn = new missing_number();
		int[] nums = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		mn.missingNumber(nums);
	}

	public void missingNumber(int[] intArray) {
		int sum1 = 0;
		for (int i : intArray)
			sum1 += i;
		int sum2 = 10 * (10 + 1) / 2;
		int difference = sum2 - sum1;
		System.out.print(difference);
	}
}
