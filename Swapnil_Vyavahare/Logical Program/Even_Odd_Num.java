package programforlogicbuilding;

import java.util.Scanner;

public class Even_Odd_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for checking-");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "-: is a even number");
		} else if (num % 2 == 1) {
			System.out.println(num + "- is a odd number");

		}
	}

	

}
