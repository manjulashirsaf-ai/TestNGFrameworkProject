package MostAksed;

import java.util.Scanner;

public class LinearBinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched :");
		int num = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		int i;
		
		//Linear Search
		for(i = 0; i < 10; i++) {
			
			if(arr[i] == num)
				break;
		}
		
		System.out.println("Element found at the index :" + i);
		
		//Binary Search - limitation - sorted order
		int low = 0;
		int high = arr.length - 1;
		boolean flag = false;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(arr[mid] == num) {
				flag = true;
				break;
			}
			else if(arr[mid] < num)
				low = mid + 1;
			else if(arr[mid] > num)
				high = mid - 1;
		}
		if(flag)
			System.out.println("element found");
		else
			System.out.println("element not found");
	}
}

