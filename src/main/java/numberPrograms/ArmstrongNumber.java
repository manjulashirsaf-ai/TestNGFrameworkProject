package numberPrograms;

public class ArmstrongNumber {
	
	private void armStrongNumThreeDig(int num) {
		
		int res = 0;
		int numOfDigits = 0, digit = 0;
		int originalNum = num;
		int temp = num;
		
		while(temp > 0) {
			
			numOfDigits++;
			temp /= 10;
		}
		
		while(num > 0) {
			
			digit = num % 10;
			res += Math.pow(digit, numOfDigits);
			num /= 10;
		}
		
		if(res == originalNum)
			System.out.println(originalNum + " is a ArmStrong number");
		else
			System.out.println(originalNum + " is not a ArmStrong number");
		
		System.out.println();
	}

	public static void main(String args[]) {
		
		ArmstrongNumber armNum = new ArmstrongNumber();
		armNum.armStrongNumThreeDig(370);
		armNum.armStrongNumThreeDig(371);
		armNum.armStrongNumThreeDig(36);
	}
}
