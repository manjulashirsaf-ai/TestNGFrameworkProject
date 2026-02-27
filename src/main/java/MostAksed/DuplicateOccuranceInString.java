package MostAksed;

import java.util.HashMap;
import java.util.Map;

public class DuplicateOccuranceInString {

	public static void main(String[] args) {
		String s = "It is a It is a duplicate";

		Map<String, Integer> hashMap = new HashMap<>();
		String[] words = s.split(" ");

		for(String word : words) {

			//dupString.put(word, dupString.getOrDefault(word, 0) + 1);
			if(!hashMap.containsKey(word)) 
				hashMap.put(word, 1);
			else {
				hashMap.put(word, hashMap.get(word) + 1);
				System.out.println("Duplicate element is : " + word );
			}
		}
		
		System.out.println("Dupliacte Strings ---- : ");
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		Map<Character, Integer> dupChar = new HashMap<>();
		for(Character c : s.toCharArray()) {
			
			dupChar.put(c, dupChar.getOrDefault(c, 0) + 1);
		}
		
		System.out.println("Dupliacte Characters: ");
		for(Map.Entry<Character, Integer> entry : dupChar.entrySet()) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//First Non repeated Character
		System.out.println("First Non repeated Character: ");
		for(Map.Entry<Character, Integer> entry : dupChar.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
				break;
			}
		}
	}
}
