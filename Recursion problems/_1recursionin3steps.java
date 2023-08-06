package com.dsa;

public class _1recursionin3steps {
	public static void main(String[] args) {
		_1recursionin3steps obj=new _1recursionin3steps();
		int facto= obj.factorial(9);
		System.out.println(facto);
	}

	public int factorial(int n) {
		if(n<1) {
			return -1;
		}
		if(n==1 || n==0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
