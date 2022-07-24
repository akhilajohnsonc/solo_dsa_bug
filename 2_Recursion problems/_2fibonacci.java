package com.dsa;

public class _2fibonacci {

	public static void main(String[] args) {
		_2fibonacci obj=new _2fibonacci();
		int fib=obj.fibonacci(10);
		System.out.println(fib);

	}
	public int fibonacci(int n) {
		if(n<0) {
			return -1;
		}
		if(n==1 || n==0) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
