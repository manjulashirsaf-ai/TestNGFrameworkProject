package MostAksed;

public class extractLastFourChar {
	
	public static void main(String[] args) {
		
		String str = "I love selenium";
		
		String res = str.substring(str.length()-4, str.length());
		System.out.println(res);
		
		//first 4 chars
		res = str.substring(0, 4);
		System.out.println(res);
	}
}
