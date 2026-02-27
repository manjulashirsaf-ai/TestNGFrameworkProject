package arrayPrograms;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);

        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        System.out.println("Common elements: " + common);
        
        int[] arr11 = {1, 2, 3, 4, 5};
        int[] arr21 = {3, 4, 5, 6, 7};

        List<Integer> common1 = new ArrayList<>();
        for (int num : arr11) {
            for (int num2 : arr21) {
                if (num == num2) {
                    common1.add(num);
                    break;
                }
            }
        }

        System.out.println("Common elements: " + common1);
    }

}
