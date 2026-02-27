package arrayPrograms;

import java.util.*;

public class ReverseArray {

	public static int[] reverse(int[] arr) {

		int[] revArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {

			revArr[i] = arr[arr.length - 1 - i];
		}

		return revArr;
	}
	
	public static void print(int[] arr) {
		
		for( int i = 0; i <= arr.length - 1; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		arr = reverse(arr);
		print(arr);
		
		System.out.println("*******************");
		
		int[] arr1 = {1, 2, 3, 4, 5};

        int n = arr1.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[n - 1 - i];
            arr1[n - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr1));
        
        System.out.println("*******************");
        
        Integer[] arr11 = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(arr11);
        Collections.reverse(list);

        System.out.println("Reversed array: " + Arrays.toString(arr11));
	}
	
}