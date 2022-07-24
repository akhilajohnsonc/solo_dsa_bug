package com.array;

import java.util.Arrays;
//[0, 3]
public class pairs {

	public static void main(String[] args) {
		pairs mn = new pairs();
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] results = mn.twoSum(nums, 5);
		System.out.println(Arrays.toString(results));
	}

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}

		}
		throw new IllegalArgumentException("Notfound");
	}

}
