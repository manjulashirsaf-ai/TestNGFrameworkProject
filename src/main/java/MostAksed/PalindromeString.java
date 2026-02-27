package MostAksed;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String :");
			String str = sc.nextLine();

			StringBuilder strBuild = new StringBuilder(str);

			if(strBuild.reverse().toString().equalsIgnoreCase(str)) 
				System.out.println("Palindrome");
			else 
				System.out.println("Not a Palindrome");
			
			System.out.println("Enter number :");
			int num = sc.nextInt();
			
			StringBuilder strbuildNum = new StringBuilder(String.valueOf(num));
			if(strbuildNum.reverse().equals(strbuildNum))
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
				
			/*System.out.println("Using Recursion : ");
			str = str.toLowerCase();
			if(isPalindrome(str, 0, str.length() - 1))
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");*/
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static boolean isPalindrome(String str, int start, int end) {

		if(str == null || str.isEmpty())
			return false;
		
		if (start >= end) 
			return true;

		if(str.charAt(start) != str.charAt(end))
			return false;

		return isPalindrome(str, start+1, end-1);
	}

}
