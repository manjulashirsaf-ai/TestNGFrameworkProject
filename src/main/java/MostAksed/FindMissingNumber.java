package MostAksed;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Array size : ");
		int arrSize = sc.nextInt();
		System.out.println("Array elements: ");
		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		int expectedSum = ((arrSize + 1) * (arrSize + 1 +1))/2;
		int sum = 0;
		for(int i = 0; i < arrSize; i++) {
			
			sum += arr[i];
		}
		
		int missingNumber = expectedSum - sum;
		System.out.println("Missing number is : " + missingNumber);
	}
}
