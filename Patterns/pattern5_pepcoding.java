package Patterns;

import java.util.Scanner;
/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
5
  *
 ***
*****
 ***
  *
*/

public class pattern5_pepcoding {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int space = n / 2;
		int star = 1;
		for (int i = 1; i <= n; i++) {
			// for spaces
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// for stars
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if (i <= n / 2) {
				space--;
				star = star + 2;
			} else {
				space++;
				star = star - 2;
			}
			System.out.println();
		}

	}

}
