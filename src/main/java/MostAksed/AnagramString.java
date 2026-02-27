package MostAksed;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter second String :");
		String s2 = sc.nextLine();
		
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
