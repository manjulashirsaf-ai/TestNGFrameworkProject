package arrayPrograms;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 0, 3, 0, 4};

		int start = 0; // points to position to place next non-zero
		int end = arr.length;

		// Move all non-zero elements to the front
		for (int i = 0; i < end; i++) {
			if (arr[i] != 0) {
				arr[start++] = arr[i];
			}
		}

		// Fill the remaining positions with 0
		while (start < end) {
			arr[start++] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}
}
