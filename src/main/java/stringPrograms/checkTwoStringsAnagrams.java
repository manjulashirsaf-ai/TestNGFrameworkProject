package stringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkTwoStringsAnagrams {
	
	 public static boolean isAnagram(String str1, String str2) {
	        // Remove spaces and convert to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // If lengths differ, cannot be anagram
	        if (str1.length() != str2.length()) return false;

	        // Convert strings to char arrays and sort
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        return Arrays.equals(arr1, arr2);
	    }
	 
	 public static boolean isAnagramMap(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        if (str1.length() != str2.length()) return false;

	        Map<Character, Integer> map = new HashMap<>();

	        for (char c : str1.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        for (char c : str2.toCharArray()) {
	            if (!map.containsKey(c)) return false;
	            map.put(c, map.get(c) - 1);
	            if (map.get(c) == 0) map.remove(c);
	        }

	        return map.isEmpty();
	 }
	 
	 public static boolean isAnagramArray(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        if (str1.length() != str2.length()) return false;

	        int[] count = new int[26]; // For a-z letters

	        for (int i = 0; i < str1.length(); i++) {
	            count[str1.charAt(i) - 'a']++;
	            count[str2.charAt(i) - 'a']--;
	        }

	        for (int c : count) {
	            if (c != 0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String s1 = "Listen";
	        String s2 = "Silent";

	        if (isAnagram(s1, s2)) {
	            System.out.println(s1 + " and " + s2 + " are anagrams.");
	        } else {
	            System.out.println(s1 + " and " + s2 + " are not anagrams.");
	        }
	        
	        System.out.println(isAnagramMap("Triangle", "Integral")); // true
	        System.out.println(isAnagramMap("Hello", "Bello"));       // false
	        System.out.println(isAnagramArray("Debit Card", "Bad Credit")); // true
	    }
}
