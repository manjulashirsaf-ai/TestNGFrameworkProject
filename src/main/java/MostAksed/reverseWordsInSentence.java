package MostAksed;

public class reverseWordsInSentence {

	private static void reverseWordsInSentenceString(String str) {

		String revStr = "";
		String[] arr = str.split(" ");

		for(int i = arr.length - 1  ; i >= 0; i--) {

			revStr += arr[i] + " ";
		}

		System.out.println("Before reversing words in a sentence: " + str);
		System.out.println("After reversing words in a sentence: " + revStr);
	}
	
	static void reverseWordsInSentenceStringBuilder(String str) {

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
		reverseWordsInSentence.reverseWordsInSentenceString(str);
		reverseWordsInSentence.reverseWordsInSentenceStringBuilder(str);
	}
}
