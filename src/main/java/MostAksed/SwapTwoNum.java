package MostAksed;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 value : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2 value : ");
		int num2 = sc.nextInt();
		
		System.out.println("Numbers before reversal : " + num1 + " "  +num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers before reversal : " + num1 + " "  +num2);
		
		System.out.println("Numbers before reversal : " + num1 + " "  +num2);
		num1 = num1 + num2;	//10 + 20
		num2 = num1 - num2; //30 - 20
		num1 = num1 - num2; //30 - 10
		System.out.println("Numbers before reversal : " + num1 + " "  +num2);
		
		
	}
}
