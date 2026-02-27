package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatedChar {

	public static void main(String args[]) {

		HashMap<Character, Integer> charCount = new HashMap<>();
		String str = "automation";
		countOccurrencesOfEachCharacter occurance = new countOccurrencesOfEachCharacter();
		charCount = occurance.occurances(str);

		// Find first character with count 1
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First Non repeatable char: " + entry.getKey());
				break;
			}
		}

		// Find all character with count 1
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("Non repeatable char: " + entry.getKey());
			}
		}
	}
}
