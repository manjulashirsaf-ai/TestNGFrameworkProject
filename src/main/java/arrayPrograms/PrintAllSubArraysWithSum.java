package arrayPrograms;

public class PrintAllSubArraysWithSum {

	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4}; // example array

		System.out.println("All subarrays with their sums:");

		// Loop over all possible start indices
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // cumulative sum for the current subarray
			// Loop over all possible end indices for this start
			for (int j = i; j < arr.length; j++) {
				sum += arr[j]; // add current element to sum

				// Print the subarray
				System.out.print("[");
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]);
					if (k < j) System.out.print(", ");
				}
				System.out.println("] Sum = " + sum);
			}
		}
	}
}
