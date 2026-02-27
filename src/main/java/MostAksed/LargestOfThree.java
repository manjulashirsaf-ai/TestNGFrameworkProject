package MostAksed;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers : ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest = 0;
		
		// #1 
		if(a > b && a > c)
			largest = a;
		else if (b > a && b > c)
			largest = b;
		else
			largest = c;
		
		System.out.println("Largest of three given numbers is :" + largest);
		
		// #2
		largest = a > b ? a : b;
		largest = largest > c ? largest : c;
		System.out.println("Largest is :" + largest);
	}
}
