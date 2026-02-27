package MostAksed;

import java.util.Scanner;

public class CountNumOfDigitsEvenOdd {
	
	public int countDigit(int num) {
		
		int count = 0;
		while(num > 0) {
			
			num /= 10;
			count ++;
		}
		return count;
	}
	
	public int[] countEvenOddDigit(int num) {
		
		int evenCount = 0;
		int oddCount = 0;
		
		int rem = 0;
		while(num > 0) {
			
			rem = num % 10;
			num /= 10;
			
			if(rem % 2 == 0)
				evenCount ++;
			else
				oddCount ++;
		}
		int[] count = { evenCount, oddCount};
		
		return count;
	}
	
	int sumOfDigits(int num) {
		
		int sum = 0;
		
		int rem = 0;
		while(num > 0) {
			
			rem = num % 10;
			num /= 10;
			sum += rem;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			
			CountNumOfDigitsEvenOdd obj = new CountNumOfDigitsEvenOdd();
			int count = obj.countDigit(num);
			System.out.println("Number of digits in the given number : " + count);
			
			int[] countEvenOdd = obj.countEvenOddDigit(num);
			System.out.println("Number of even digits : " + countEvenOdd[0]);
			System.out.println("Number of odd digits : " + countEvenOdd[1]);
			
			int sum = obj.sumOfDigits(num);
			System.out.println("Sum of digits is :" + sum);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
