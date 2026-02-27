package arrayPrograms;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 3};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) { // add() returns false if element already exists
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
        
        System.out.println("********************************");
        
        int[] arr1 = {1, 2, 3, 2, 3, 4, 5, 3};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        
        System.out.println("********************************");
        
        int[] arr11 = {1, 2, 3, 2, 3, 4, 5, 3};
        Arrays.sort(arr11);

        System.out.print("Duplicate elements: ");
        for (int i = 1; i < arr11.length; i++) {
            if (arr11[i] == arr11[i - 1]) {
                System.out.print(arr11[i] + " ");
                // Skip duplicates
                while (i < arr11.length && arr11[i] == arr11[i - 1]) i++;
            }
        }
    }
}