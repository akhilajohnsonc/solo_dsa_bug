package com.array;

public class Singledimensionalarray {
	int[] arr = null;

	public Singledimensionalarray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insertinpos(int pos, int value) {
		try {
			if (arr[pos] == Integer.MIN_VALUE) {
				arr[pos] = value;
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
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public void search(int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Found in index " + i);
				return;
			}
		}
		System.out.println("Not found");
	}

	public void delete(int index) {
		try {
			arr[index] = Integer.MIN_VALUE;
			System.out.println("Value is deleted successfully");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}

}
