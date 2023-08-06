package com.array;

import java.util.Arrays;
//creating empy array space complexity (mn) time o(1)
public class Arraybasic2d {

	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		arr[1][1]=3;
		System.out.println(Arrays.deepToString(arr));
		int[][] arr1= {{1,2},{3,4}};
		System.out.println(Arrays.deepToString(arr1));
		twodimensionalarray obj= new twodimensionalarray(2, 2);
		obj.insertinpos(1, 1, 100);
		obj.insertinpos(1, 2, 100);
		obj.insertinpos(0, 0, 76);
		obj.traverseArray();
		obj.search(100);
		obj.delete(0, 0);
		obj.traverseArray();
	}

}
