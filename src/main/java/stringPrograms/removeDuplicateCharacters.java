package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateCharacters {

	static public void removeDuplicates(String s) {

		String result = "";
		Set<Character> removeDuplicates = new HashSet<>();

		for(Character c : s.toCharArray()) {
			
			if(!removeDuplicates.contains(c)) {
				removeDuplicates.add(c);
				result += c;
			}	
		}
		/*for (Character s1 : removeDuplicates) {
	            System.out.println(s1);
	        }*/
		System.out.println("Before Duplicate Removal: " + s);
		System.out.println("After Duplicates Removal: "+ result);
	}
	
	public static void main(String args[]) {
		
		removeDuplicateCharacters.removeDuplicates("automation");
	}
}
