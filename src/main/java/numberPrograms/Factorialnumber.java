package numberPrograms;

import java.util.Scanner;

public class Factorialnumber {
	
	int factorialOfNumber(int n) {
		
		//n! = n*(n-1)*(n-2)*......1
		int fact = 1;
		while(n >= 1) {
			
			fact *= n;
			n--;
		}
		return fact;
	}
	
	public static void main(String args[]) {
		
		Factorialnumber fact = new Factorialnumber();
		int factorial = fact.factorialOfNumber(10);
		System.out.println(factorial);
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter number: ");
			int num = input.nextInt();
			int factorial1 = fact.factorialOfNumber(num);
			System.out.println(factorial1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
