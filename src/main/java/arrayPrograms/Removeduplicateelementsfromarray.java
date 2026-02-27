package arrayPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicateelementsfromarray {
	
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 4, 4, 5};

	        // Use LinkedHashSet to remove duplicates and preserve order
	        Set<Integer> set = new LinkedHashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        // Convert set back to array
	        int[] result = new int[set.size()];
	        int i = 0;
	        for (int num : set) {
	            result[i++] = num;
	        }
	        // Print result
	        System.out.println(Arrays.toString(result));
	        
	        int[] arr1 = {1, 2, 2, 3, 4, 4, 5};

	        // Remove duplicates and preserve order using Java 8 Streams
	        int[] result1 = Arrays.stream(arr)   // create an IntStream
	                             .distinct()    // remove duplicates
	                             .toArray();    // collect back into int[]

	        // Print the result
	        System.out.println(Arrays.toString(result1));
	    }

}
