package stringPrograms;

import java.util.Stack;

public class reverseWordsInSentence {

	private static void reverseWordsInSentence(String str) {

		String revStr = "";
		String[] arr = str.split(" ");

		for(int i = arr.length - 1  ; i >= 0; i--) {

			revStr += arr[i] + " ";
		}

		System.out.println("Before reversing words in a sentence: " + str);
		System.out.println("After reversing words in a sentence: " + revStr);
		/*for(String s : arr) {
			System.out.println(s);
		}*/
	}
	
	static void reverseWordsInSentenceStack(String str) {

		String revStr = "";
		String[] arr = str.split(" ");

		Stack<String> stk = new Stack<>();
		for(String st : arr) {
			stk.push(st);
		}
		
		while(!stk.empty()) {
			
			revStr += stk.pop() + " ";
		}
		
		System.out.println("Before reversing words in a sentence: " + str);
		System.out.println("After reversing words in a sentence: " + revStr);
	}
	
	static void reverseWordsInSentenceStringBuilder(String str) {

		String revStr = "";
		String[] arr = str.split(" ");

	    StringBuilder sb = new StringBuilder();
	    for (int i = arr.length - 1; i >= 0; i--) {
	        sb.append(arr[i]).append(" ");
	    }

		System.out.println("Before reversing words in a sentence: " + str);
		System.out.println("After reversing words in a sentence: " + sb.toString().trim());
	}

	public static void main(String args[]) {

		String str = "This is miracle";
		reverseWordsInSentence.reverseWordsInSentence(str);
		reverseWordsInSentence.reverseWordsInSentenceStack(str);
		reverseWordsInSentence.reverseWordsInSentenceStringBuilder(str);
	}
}
