package MostAksed;

import java.util.Scanner;

public class FactorialOfANum {
	
	public static int recFactN(int factNum) {
		
		if (factNum < 1)
			return 1;
		else
			return factNum * recFactN(factNum - 1);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Factoral Num : ");
		try (Scanner sc = new Scanner(System.in)) {
			int factNum = sc.nextInt();
			int result = 1;
			for(int i = 1; i<=factNum; i++) {
				
				result *= i;
			}
			System.out.println("Factorial is : " + result);
			
			int recResult = recFactN(factNum);
			System.out.println("Recursion Factorial is : " + recResult);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught is " + e.getMessage());
		}
	}
}
