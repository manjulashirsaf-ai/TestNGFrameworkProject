package numberPrograms;

import java.util.Stack;

public class SwapTwoVariables {

	public void swap(int[] arr) {
	    int temp = arr[0];
	    arr[0] = arr[1];
	    arr[1] = temp;
	}
	
	public int[] swap(int a, int b) {
	    return new int[]{b, a};
	}
	
	// Swap method using Stack
    public void swapWithStack(int[] nums) {
        System.out.println("Before swapping: " + nums[0] + " " + nums[1]);

        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        st.push(nums[1]);

        nums[0] = st.pop(); 
        nums[1] = st.pop(); 
        
        System.out.println("After swapping: " + nums[0] + " " + nums[1]);
    }
	
	public static void main(String args[]) {
		
		SwapTwoVariables swap = new SwapTwoVariables();
		int[] nums = {5, 16};
		System.out.println("Before swapping: " + nums[0] + " " + nums[1]);
		
		swap.swap(nums);
	    System.out.println("After swapping: " + nums[0] + " " + nums[1]); 
	    
	    int[] swapped = swap.swap(5, 16);
	    System.out.println("After swapping: " + swapped[0] + " " + swapped[1]);

	    int[] nums1 = {5, 16};
        swap.swapWithStack(nums1);
        
        int a = 5, b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without temp variable
        a = a + b; // a = 5 + 10 = 15
        b = a - b; // b = 15 - 10 = 5 (original a)
        a = a - b; // a = 15 - 5 = 10 (original b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
