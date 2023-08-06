package com.dsa;

public class _6_decimaltobinary {

	public static void main(String[] args) {
		_6_decimaltobinary obj = new _6_decimaltobinary();
		var result = obj.dtob(-2);
		System.out.println(result);
	}

	public int dtob(int n) {
		
		if (n == 0) {
			return 0;
		}

		return (n%2)+ 10* dtob(n/2);
	}
}