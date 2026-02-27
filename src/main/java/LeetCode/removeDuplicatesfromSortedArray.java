/*
 	Input: nums = [0,0,1,1,1,2,2,3,3,4]
	Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
package LeetCode;
public class removeDuplicatesfromSortedArray {

	public static void main(String[] args) {	

		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		removeDuplicatesfromSortedArray e = new removeDuplicatesfromSortedArray();
		int arraySize = e.removeVal(nums);
		System.out.println(arraySize);
	}

	public int removeVal(int[] numsArr) {
		int i = 0, j = 1, k = 0;
		while(i <= (numsArr.length - 1) && j <= (numsArr.length - 1)) {
			if(numsArr[i] != numsArr[j]) {
				numsArr[k] = numsArr[i];
				k++;
			}
			i++;
			j++;
		}
		numsArr[k++]=numsArr[i];
		return k;
	}
}