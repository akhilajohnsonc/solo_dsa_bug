package com.array;

/*output
How many days' temperature?3
Day 0's high temp:56
Day 1's high temp:23
Day 2's high temp:15
Average= 31.333333333333332
1 days above average*/

import java.util.Scanner;

public class avg_temperature_project {
	int arr[]=null;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("How many days' temperature?");
		int n=sc.nextInt();
		avg_temperature_project obj=new avg_temperature_project();
		obj.inputtemperature(n);
		double average=obj.average(n);
		obj.aboveaverage(average);

	}
	public void inputtemperature(int numofdays) {
		arr=new int[numofdays];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			System.out.print("Day "+i+"'s high temp:");
			arr[i]=sc.nextInt();
		}
	}
	public double average(int numofdays) {
		double sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Average= "+sum/numofdays);
		return sum/numofdays;
	}
	public void aboveaverage(double avg) {
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>avg)
				count++;
			
		}
		System.out.println(count +" days above average");
	}

}
