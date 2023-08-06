package com.array;

public class is_Unique {
	public static void main(String[] args) {
		is_Unique mn = new is_Unique();
		int[] nums = { 1, 3, 10, 8, 9, 2 };
		System.out.println(mn.isUnique(nums));

	}

	public boolean isUnique(int[] intArray) {
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i]==intArray[j]) {
					return false;
				}
			}
		}
		return true;

	}
}
