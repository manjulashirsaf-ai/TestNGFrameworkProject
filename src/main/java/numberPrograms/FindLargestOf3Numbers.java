package numberPrograms;

public class FindLargestOf3Numbers {
	
	public int largest(int a, int b, int c) {
		
		int largest = 0;
		if(a >= b && a >= c)
			largest = a;
		else if( b >= a && b >= c)
			largest = b;
		else 
			largest = c;
		return largest;
	}
	
	public int largestCrisp(int a, int b, int c) {
		
		return Math.max(a, Math.max(b, c));
	}
	
	public static void main(String args[]) {
		
		FindLargestOf3Numbers large = new FindLargestOf3Numbers();
		
		int largestNum = large.largest(2,  1, 3);
		System.out.println(largestNum);
		
		largestNum = large.largestCrisp(5, 10, 5);
		System.out.println(largestNum);
	}
}
