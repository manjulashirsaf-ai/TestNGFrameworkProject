package numberPrograms;

public class CheckPalindromeNumber {
	
	void checkPalindrome(int num) {
		
		int reverseNum = reverseANumber.reverseNum1(num);
		if(num == reverseNum)
			System.out.println("The given number is Palindrome");
		else
			System.out.println("The given number is not Palindrome");
	}

	public static void main(String args[]) {
		
		CheckPalindromeNumber chkPal = new CheckPalindromeNumber();
		chkPal.checkPalindrome(444);
		chkPal.checkPalindrome(413);
	}
		
}
