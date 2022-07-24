package com.array;

public class max_Product {
	public static void main(String[] args) {
		max_Product mn = new max_Product();
		int[] nums = { 1, 3, 7, 8, 9, 2 };
		System.out.println(mn.maxProduct(nums));
		
	}
	 public String maxProduct(int[] intArray) {
	        int productmax=0;
	        int[] pairs=new int[2];
	        for (int i=0;i<intArray.length;i++) {
	        	for(int j=i+1;j<intArray.length;j++) {
	        		if(intArray[i]*intArray[j]> productmax) {
	        			productmax=intArray[i]*intArray[j];
	        			pairs[0]=intArray[i];
	        			pairs[1]=intArray[j];
	        		}
	        	}
	        }
			return "["+pairs[0]+","+pairs[1]+"]";
	    }
}

