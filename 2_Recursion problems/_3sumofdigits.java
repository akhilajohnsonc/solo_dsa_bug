package com.dsa;

public class _3sumofdigits {

	public static void main(String[] args) {
		_3sumofdigits obj= new _3sumofdigits();
		var result= obj.sumofdigits(49 );
		System.out.println(result);

	}
public int sumofdigits(int n) {
	if(n<0) {
		return -1;
	}
	if(n==0) {
		return 0;
	}
	return n%10 + sumofdigits(n/10);
}
}
