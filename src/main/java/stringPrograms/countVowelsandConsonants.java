package stringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countVowelsandConsonants {

	void countVowelConsonat(String s) {

		int vowels = 0, consonants = 0;

		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			vowels++;
			System.out.print(matcher.group() + " ");
		}
		
		Pattern pattern1 = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
		Matcher matcher1 = pattern1.matcher(s);

		System.out.println();
		while (matcher1.find()) {
			consonants++;
			System.out.print(matcher1.group() + " ");
		}

		//consonants = s.length() -1 - vowels;
		System.out.println();
		System.out.println("Number of Vowels: " + vowels);
		System.out.println("Number of Consonants: " + consonants);
	}

	void countVowelAndConsonat(String s) {

		int vowel = s.replaceAll("[^aeiouAEIOU]", "").length();
		int consonant = s.replaceAll("[^a-zA-Z]", "").length() - vowel;

		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonant);
	}

	private void count(String str) {

		int vowels = 0, consonants = 0;

		// Convert to lowercase to simplify checks
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 'a' && c <= 'z') { // consider only letters
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowel: " + vowels);
		System.out.println("Consonant" + consonants);
	}
	
	public static void main(String args[]) {

		String s = "Automation Testing";
		countVowelsandConsonants count = new countVowelsandConsonants();
		count.countVowelConsonat(s);
		count.countVowelAndConsonat(s);
		count.count(s);
	}

}
