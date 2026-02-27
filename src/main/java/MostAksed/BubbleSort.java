package MostAksed;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {10, 7, 5, 4, 8, 3, 2, 1, 9, 6};
		
		//Bubble sort
		/*for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}		
			}
		}*/
		/*for(int i = 0; i < arr.length; i++)
			System.out.println("Sorted array :" + arr[i]);*/ 
		
		//parallelSort
		/*System.out.println(Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));*/
		
		//sort
		/*System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
		
		//Reverse sort - Descending
		Integer arr1[] = {10, 7, 5, 4, 8, 3, 2, 1, 9, 6};
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}
}
