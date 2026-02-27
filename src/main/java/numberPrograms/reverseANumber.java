package numberPrograms;

import java.util.Stack;

public class reverseANumber {

	static String reverseNum(int num) {
		
		int rem = 0, dividend = 0; 
		String reverseNum = "";
		
		while(num > 0) {
			rem = num % 10;
			dividend = num / 10;
			reverseNum += rem;
			
			num = dividend;
		}
	
		return reverseNum;
	}
	
	static int reverseNum1(int num) {
        int reverse = 0;
        boolean isNegative = num < 0;
        num = Math.abs(num);

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        return isNegative ? -reverse : reverse;
    }
	
	static String reverseNum2(int num) {
	    if (num == 0) return "0";

	    StringBuilder reversed = new StringBuilder();
	    num = Math.abs(num);

	    while (num > 0) {
	        reversed.append(num % 10);
	        num /= 10;
	    }

	    return reversed.toString();
	}
	
	static int reverseNum3(int num) {
	    boolean negative = num < 0;
	    String reversed = new StringBuilder(String.valueOf(Math.abs(num)))
	            .reverse()
	            .toString();
	    int result = Integer.parseInt(reversed);
	    return negative ? -result : result;
	}
	
	static int reverseNum4(int num) {
	    return reverseHelper(num, 0);
	}

	static int reverseHelper(int num, int rev) {
	    if (num == 0) return rev;
	    return reverseHelper(num / 10, rev * 10 + num % 10);
	}
	
	static int reverseNum5(int num) {
	    int reversed = 0;
	    int digits = (int) Math.log10(num);

	    while (num > 0) {
	        reversed += (num % 10) * Math.pow(10, digits--);
	        num /= 10;
	    }
	    return reversed;
	}
	
	static int reverseNum6(int num) {
	    Stack<Integer> stack = new Stack<>();
	    int reversed = 0;

	    while (num > 0) {
	        stack.push(num % 10);
	        num /= 10;
	    }

	    int multiplier = 1;
	    while (!stack.isEmpty()) {
	        reversed += stack.pop() * multiplier;
	        multiplier *= 10;
	    }
	    return reversed;
	}
	
	public static void main(String args[]) {
		
		int num = 243;
		System.out.println("Original number: " + num);
		System.out.println("Reversed number: " + reverseANumber.reverseNum(num));
		System.out.println("Reversed number: " + reverseANumber.reverseNum1(num));
		System.out.println("Reversed number: " + reverseANumber.reverseNum2(num));
		System.out.println("Reversed number: " + reverseANumber.reverseNum3(num));
		System.out.println("Reversed number: " + reverseANumber.reverseNum4(num));
		System.out.println("Reversed number: " + reverseANumber.reverseNum5(num));
		System.out.println("Reversed number: " + reverseANumber.reverseNum6(num));
	}
}
