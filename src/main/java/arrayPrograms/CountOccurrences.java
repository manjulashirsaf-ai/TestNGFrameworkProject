package arrayPrograms;

import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            // Increment count if exists, else initialize to 1
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print results
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
        
        System.out.println("*******************");
        
        int[] arr1 = {1, 2, 2, 3, 3, 3, 4};
        int max = 4; // max value in array
        int[] count = new int[max + 1];

        for (int num : arr1) count[num]++;

        for (int i = 1; i <= max; i++) {
            if (count[i] > 0)
                System.out.println(i + " occurs " + count[i] + " times");
        }
    }
}