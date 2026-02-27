package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxEle {
	
	public static void findMinMax(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        int secMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] > max) {
        		secMax = max;
        		max = arr[i];
        	}
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Min is : " + min);
        System.out.println("Max is : " + max);
        System.out.println("Second Max is : " + secMax);
    }
	
	public static void main(String[] args) {
		
		//int arr[] = {3, 5, 4, 1, 9};
		int arr[] = {22, 14, 8, 17, 35, 3};
		
		findMinMax(arr);
		
		// Ascending order
		Arrays.sort(arr);
		System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
		System.out.println("Smallest: " + arr[0]);
		System.out.println("Largest: " + arr[arr.length - 1]);
		System.out.println("Second Largest: " + arr[arr.length - 2]);
		
		Integer arr1[] = {22, 14, 8, 17, 35, 3};
		// Descending order
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int num : arr1) {
            System.out.print(num + " ");
        }
	}
}