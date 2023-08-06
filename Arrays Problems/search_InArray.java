package com.array;

public class search_InArray {
	public static void main(String[] args) {
		search_InArray mn = new search_InArray();
		int[] nums = { 1, 6, 7, 8, 9, 10 };
		System.out.println(mn.searchInArray(nums, 6));
		
	}

	public int searchInArray(int[] intArray, int valueToSearch) {
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]==valueToSearch)
				return i;
		}
		return 0;
	}
}
