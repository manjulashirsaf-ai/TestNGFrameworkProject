package MostAksed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInArray {
	
	
	public void findDuplicateBruteForce(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j])
					System.out.println("Duplicate element is : " + arr[i]);
			}
		}
	}

	
	public void findDuplicateSort(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			if(arr[i] == arr[i+1]) {
				System.out.println("Duplicate element is : " + arr[i]);
			}
		}
	}
	
	public void findDuplicateHashSet(int[] arr) {
		
		Set<Integer> hashSet = new HashSet<>();
		
		for( int num : arr) {
			
			if(!hashSet.add(num)) {
				System.out.println("Duplicate element is : " + num);
			}
		}
	}
	
	public void findDuplicateHashMap(int[] arr) {
		
		Map<Integer, Integer> hasMap = new HashMap<Integer, Integer>();
		
		for(int num : arr) {
			if(!hasMap.containsKey(num)) 
				hasMap.put(num, 1);
			else {
				hasMap.put(num, hasMap.get(num) + 1);
				System.out.println("Duplicate element is : " + num );
			}
		}
		
		/*for(Integer num : hasMap.keySet()) {
			
			if(hasMap.get(num)> 1)
				System.out.println("Duplicate element is : " + num );
		}*/
		
		/*for(Entry<Integer, Integer> entry : hasMap.entrySet()) {
		
		if(entry.getValue() > 1)
			System.out.println("Duplicate element is : " + entry.getKey() );
		}*/
	}
	
	public static void main(String[] args) throws IOException {
		
		int[] arr = {2, 5, 6, 7, 6, 8, 2, 9};
		
		DuplicatesInArray duplicate = new DuplicatesInArray();
		duplicate.findDuplicateBruteForce(arr);
		duplicate.findDuplicateSort(arr);
		duplicate.findDuplicateHashSet(arr);
		duplicate.findDuplicateHashMap(arr);
	}
}
