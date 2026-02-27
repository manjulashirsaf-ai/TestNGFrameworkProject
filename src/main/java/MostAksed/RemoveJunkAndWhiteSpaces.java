package MostAksed;

public class RemoveJunkAndWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "$%^&&*Hi There 1234560987";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String str = "I              LOVE            YOU";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
