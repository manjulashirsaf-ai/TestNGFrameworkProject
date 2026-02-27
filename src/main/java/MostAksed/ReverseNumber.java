package MostAksed;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int numForUseNextInBuff = num;
			int numForUseNextInBuild = num;
			
			//#1
			int result = 0;
			while(num > 0) {
				
				result = result * 10 + num % 10;
				num /= 10;
			}
			
			System.out.println("Reversed number : " + result);
			
			//#2
			StringBuffer buff = new StringBuffer(String.valueOf(numForUseNextInBuff));
			System.out.println("Reversed number : " + buff.reverse());
			
			//#3
			StringBuilder builder = new StringBuilder(String.valueOf(numForUseNextInBuild));
			System.out.println("Reversed number : " + builder.reverse());
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
