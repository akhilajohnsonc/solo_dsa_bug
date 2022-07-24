package com.array;

import java.util.Arrays;

/*Creating an empty array space complexity=o(n)time=o(1)
traversal,search time complexity=o(n)
other are o(1)*/
public class Arraybasics3d {

	public static void main(String[] args) {
		System.out.println("-------------Array initialization example-------------");
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=9;
		int[] arr1 = {1,2,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		
		System.out.println("-------------Insertion example-------------");
		Singledimensionalarray obj= new Singledimensionalarray(10);
		obj.insertinpos(1, 10);
		obj.insertinpos(2, 3);
		obj.insertinpos(11, 2);
		obj.insertinpos(1, 6);
		
		System.out.println("-------------Traverse example-------------");
		obj.traverseArray();
		
		System.out.println("-------------search example-------------");
		obj.search(10);
		obj.search(100);
		
		System.out.println("-------------delete example-------------");
		obj.delete(1);
		obj.delete(10);
	}
	

}
