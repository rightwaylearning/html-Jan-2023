package programforlogicbuilding;

import java.util.Scanner;

public class Sum_Of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the staring number from which you want sum of number");
		int startNum = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the end number upto which you want sum of number");
		int endNum = sc1.nextInt();
		
		int sum =0;
		
		for(int i=startNum; i<=endNum; i++) {
			sum = sum +i;
		}
		
		System.out.println(sum);

	}

}
