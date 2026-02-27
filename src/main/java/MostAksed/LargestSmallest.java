package MostAksed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of elements: ");
			int n = sc.nextInt();  // size of array

			int[] arr = new int[n];

			System.out.println("Enter " + n + " integers:");
			for (int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();  // read each integer
			}
			
			int largest = arr[0];
			int smallest = arr[0];
			for( int i = 1; i <= arr.length - 1; i++) {
				
				if(arr[i] > largest)
					largest = arr[i];
				if(arr[i] < smallest)
					smallest = arr[i];
			}
			
			System.out.println("Largest :" + largest);
			System.out.println("Smallest : " + smallest);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
