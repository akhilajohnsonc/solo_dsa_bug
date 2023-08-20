package Patterns;

import java.util.Scanner;
/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
5
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 
*/

public class pattern6_pepcoding {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = n / 2+1;
		int space = 1;
		for (int i = 1; i <= n; i++) {
			// for stars
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			// for spaces
			for (int k = 1; k <= space; k++) {
				System.out.print("  ");
			}
			// for stars
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			if (i <= n / 2) {
				star--;
				space = space + 2;
			} else {
				star++;
				space = space - 2;
			}
			System.out.println();
		}

	}

}
