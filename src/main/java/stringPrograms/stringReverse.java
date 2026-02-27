package stringPrograms;

public class stringReverse {

	void stringReverse(String s) {

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("Reversed string: " + rev);
	}

	void stringReverse1(String s) {
		StringBuilder sb = new StringBuilder(s);
		System.out.println("Reversed string: " + sb.reverse());
	}


	String stringReverse2(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}

	void stringReverse3(String s) {
		char[] ch = s.toCharArray();

		System.out.print("Reversed string: ");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		stringReverse obj = new stringReverse();

		obj.stringReverse("Automation");
		obj.stringReverse1("Automation");
		System.out.println("Reversed string: " + obj.stringReverse2("Automation"));
		obj.stringReverse3("Automation");
	}
}
