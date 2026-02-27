package arrayPrograms;

public class MaxSubArray {
	
	public static int maxSubArray(int[] arr)
    {
		int max = arr[0];   // max sum so far
	    int sum = arr[0];   // current subarray sum

	    for (int i = 1; i < arr.length; i++) {
	        sum = Math.max(arr[i], sum + arr[i]); // start new subarray or extend
	        max = Math.max(max, sum);            // update maximum
	    }
	    return max;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int maxArr;
		
		maxArr = maxSubArray(arr);
		System.out.println(maxArr);
	}
}