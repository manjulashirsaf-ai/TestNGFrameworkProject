package MostAksed;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter String :");
		String str = sc.nextLine();
		
		// #1 - StringBuilder
		StringBuilder strBuild = new StringBuilder(str);
		System.out.println(strBuild.reverse().toString());
		
		// #2 - StringBuffer
		StringBuffer strBuff = new StringBuffer(str);
		System.out.println(strBuff.reverse().toString());
		
		// #3 - Iterating String Array
		String res = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			
			res += str.charAt(i);
		}
		System.out.println(res);
		
		// #4 - Using character array
		char[] a = str.toCharArray();
		String strRev = "";
		for(int i = a.length - 1; i >= 0 ; i--) {
			strRev += a[i];
		}
		System.out.println(strRev);
	}
}
