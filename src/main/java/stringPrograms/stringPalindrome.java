package stringPrograms;

public class stringPalindrome {

	static boolean strPalindrome(String s) {
		
		stringReverse str = new stringReverse();
		if(str.stringReverse2(s).equals(s))
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		
		if(strPalindrome("madam") == true)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}
