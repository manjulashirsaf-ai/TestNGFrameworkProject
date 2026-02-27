/*	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	Output: [1,2,2,3,5,6]
*/
package LeetCode;
public class mergeSort_DivideAndConquer {
    public static void main(String[] args) {	
    	
    	int[] nums1 = new int[] {1,2,3,0,0,0};
    	int[] nums2 = new int[] {2,5,6};
    	int m = 3,  n = 3;
    	mergeSort_DivideAndConquer merger = new mergeSort_DivideAndConquer();
    	merger.merge(nums1, m, nums2, n);
    	merger.print(nums1);
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		
    	int i = m - 1, j = n - 1, k = (m + n) - 1;
    	while( i >= 0 && j >= 0) {
    		
    		if(nums1[i] < nums2[j])
				nums1[k--] = nums2[j--];
    		else
    			nums1[k--] = nums1[i--];
    	}
    	
    	while(j>=0)
    		nums1[k--] = nums2[j--];    	
	}
    
    public void print(int[] nums1) {
    	int i = 0;
    	while(i < nums1.length) {
    		System.out.println(nums1[i]);
    		i++;
    	}
    }
}