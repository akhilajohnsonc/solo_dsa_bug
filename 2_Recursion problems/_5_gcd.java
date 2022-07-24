package com.dsa;

public class _5_gcd {

	public static void main(String[] args) {
		_5_gcd obj = new _5_gcd();
		var result = obj.gcd(26, 5);
		System.out.println(result);
	}

	public int gcd(int a, int b) {
		if (b < 0 || a < 0) {
			return -1;
		}
		if (b == 0) {
			return a;
		}
		System.out.println(a + "   " + b);

		return gcd(b, a % b);
	}
}