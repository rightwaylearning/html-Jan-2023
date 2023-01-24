package programforlogicbuilding;

import java.util.Scanner;

public class Sum_EvenOdd_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stating number for checking-");
		int startnum = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Ending Number for checking-:");
		int endNum = sc1.nextInt();

		int evensum = 0;
		int oddsum = 0;

		for (int i = startnum; i <= endNum; i++) {

			if (i % 2 == 0) {
				evensum = evensum + i;

			}

		}
		System.out.println("The sum of even num in between " + startnum + " to " + endNum + " is " + evensum);

		for (int j = startnum; j <= endNum; j++) {
			if (j % 2 == 1) {
				oddsum = oddsum + j;
			}

		}
		System.out.println("The sum of odd Num in between " + startnum + " to " + endNum + " is " + oddsum);

	}
}
