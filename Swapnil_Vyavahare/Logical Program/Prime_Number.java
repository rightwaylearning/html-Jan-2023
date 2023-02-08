package programforlogicbuilding;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the which you want to check- ");
		int num = sc.nextInt();
		
		boolean result =true;
		
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				result = false;
			}
			
		}
		
		if(result) {
			System.out.println(num +" -: is primre number");
		}else {
			System.out.println(num + " -: is not a prime number");
		}
			
		

	}

}
