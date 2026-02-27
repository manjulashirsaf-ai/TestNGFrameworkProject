package numberPrograms;

public class Sumofdigitsofnumber {

	public int sum(int num) {
		
		int rem = 0;
		int sum = 0;
		
		while(num > 0) {
			
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		
		Sumofdigitsofnumber sumObj = new Sumofdigitsofnumber();
		int sum = sumObj.sum(3678);
		
		System.out.println(sum);
	}
}


