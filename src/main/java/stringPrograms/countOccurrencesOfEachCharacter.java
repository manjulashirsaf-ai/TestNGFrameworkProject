package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class countOccurrencesOfEachCharacter {
	
	public HashMap occurances(String s) {
		
		Map<Character, Integer> occurance = new HashMap<>();
		for(char c : s.toCharArray()) {
		
			occurance.put(c, occurance.getOrDefault(c, 0) + 1);
		}
		System.out.println(occurance);
		return (HashMap) occurance;
	}

static public void main(String args[]) {
	
		String str = "automation";
		countOccurrencesOfEachCharacter occurance = new countOccurrencesOfEachCharacter();
		occurance.occurances(str);
	}
}

