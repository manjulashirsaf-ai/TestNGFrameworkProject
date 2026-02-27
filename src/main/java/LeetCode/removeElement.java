/*
 	Input: nums = [3,2,2,3], val = 3
	Output: 2, nums = [2,2,_,_]
 */
package LeetCode;
public class removeElement {

	public static void main(String[] args) {	

		int[] nums = new int[] {3,2,2,3};
		int val = 3;
		removeElement e = new removeElement();
		int arraySize = e.removeVal(nums, val);
		System.out.println(arraySize);
	}

	public int removeVal(int[] nums, int val) {
		int i = 0, j = nums.length - 1, k =0;
		while(i <= j ) {
			if(nums[i] != val)
				nums[k++] = nums[ i];
			i++;
		}
		return k;
	}
}