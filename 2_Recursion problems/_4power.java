package com.dsa;

public class _4power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4power obj= new _4power();
		var result= obj.power(2,3);
		System.out.println(result);
	}
	public int power(int base,int exp) {
		if(exp<0) {
			return -1;
		}
		if(exp==0) {
			return 1;
		}
		System.out.println(base+" "+
				exp);
		return base * power(base,exp-1);
	}
}


