package com.array;

public class twodimensionalarray {
	int[][] arr = null;

	public twodimensionalarray(int row,int col) {
		arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			arr[i][j] = Integer.MIN_VALUE;
		}
		}
	}

	public void insertinpos(int row,int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Inserted");
			} else {
				System.out.println("Position is occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		}
	}

	public void traverseArray() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j] + " ");
		}
			System.out.println();
		}
		System.out.println("");
	}

	public void search(int value) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			if (arr[i][j] == value) {
				System.out.println("Found in index " + i+"-"+j);
				return;
			}
			}
		}
		System.out.println("Not found");
	}

	public void delete(int row,int col) {
		try {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Value is deleted successfully");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}

}
