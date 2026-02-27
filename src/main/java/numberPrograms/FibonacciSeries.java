package numberPrograms;

public class FibonacciSeries {

	public void fibonacci(int n) {
		
		int a = 0, b = 1;
		int c = a + b;
		System.out.print(a +" " + b + " " + c + " ");
		
		while(c < n) {
			a = b;
			b = c;
			c = a + b;
			if(c <= n)
				System.out.print(c + " ");
		}
	}
	
	public static void main(String args[]) {
		
		FibonacciSeries fib = new FibonacciSeries();
		fib.fibonacci(30);
	}
	
}
