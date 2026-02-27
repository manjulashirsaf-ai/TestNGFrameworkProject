package MostAksed;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter up to Fibanacci : ");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int fib0 = 0;
			int fib1 = 1;
			int fibNext = 0;
			
			while(n > 0) {
				
				System.out.print(fib0 + " ");
				fibNext = fib0 + fib1;
				fib0 = fib1;
				fib1 = fibNext;
				n--;
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
