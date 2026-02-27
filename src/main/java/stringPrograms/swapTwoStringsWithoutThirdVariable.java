package stringPrograms;

import java.util.Stack;

public class swapTwoStringsWithoutThirdVariable {

	static void swapWithThirdVariable(String str1, String str2) {
		
		String str3;
		
		System.out.println("Before swapping: " + str1 + " " + str2);
		str3 = str1;
		str1 = str2;
		str2 = str3;
		System.out.println("After swapping: " + str1 + " " + str2);
	}
	
	static void swap(String str1, String str2) {
		
		System.out.println("Before swapping: " + str1 + " " + str2);
		Stack<String> stk = new Stack<>();
		stk.push(str1);
		stk.push(str2);
		
		str1 = stk.pop();
		str2 = stk.pop();
		System.out.println("After swapping: " + str1 + " " + str2);
	}
	
	static void swap1(String str1, String str2) {
		
		System.out.println("Before swapping: " + str1 + " " + str2);
		str1 = str1 + str2; // "HelloWorld"
		str2 = str1.substring(0, str1.length() - str2.length()); // "Hello"
		str1 = str1.substring(str2.length()); // "World"
		System.out.println("After swapping: " + str1 + " " + str2);
	}
	
	public static void main(String args[]) {
		
		swapTwoStringsWithoutThirdVariable.swap("Hello", "World");
		swapTwoStringsWithoutThirdVariable.swap1("Hello", "World");
		swapTwoStringsWithoutThirdVariable.swapWithThirdVariable("Hello", "World");
	}
}
