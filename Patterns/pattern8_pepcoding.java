package Patterns;

import java.util.Scanner;
/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
5
        *
      *
    *
  *
*
*/

public class pattern8_pepcoding {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == star) {
					System.out.print("*");
					break;
				}
				System.out.print("  ");
			}
			System.out.println();
			star--;
		}

	}

}
