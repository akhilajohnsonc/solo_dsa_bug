package patterns;

import java.util.Scanner;

/*Pattern 2
5
* * * * * 
* * * * 
* * * 
* * 
* 
*/
public class pattern2_pepcoding {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nstars = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nstars; j++) {
				System.out.print("* ");
			}
			nstars--;
			System.out.println();
		}

	}

}
