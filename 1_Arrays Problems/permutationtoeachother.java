package com.array;

public class permutationtoeachother {
	public static void main(String[] args) {
		permutationtoeachother mn = new permutationtoeachother();
		int a[] = {1, 2, 3, 4, 5};
	    int b[] = {2, 1, 4, 5, 3};
		System.out.println(mn.permutation(a, b));

	}

	public boolean permutation(int[] array1, int[] array2) {
		int mul1 = 1;
		int mul2 = 1;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < array1.length; i++) {
			mul1 *= array1[i];
			mul2 *= array2[i];
			sum1 += array1[i];
			sum2 += array2[i];
		}
		if (mul1 == mul2 && sum1 == sum2) {
			return true;
		}
		return false;
	}
}
