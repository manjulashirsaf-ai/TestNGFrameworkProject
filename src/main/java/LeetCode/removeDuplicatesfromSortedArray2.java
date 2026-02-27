/*
 	Input: nums = [0,0,1,1,1,2,2,3,3,4]
	Output: 5, nums = [0,0,1,1,2,2,3,3,4,_,_,_,_,_]
 */
package LeetCode;
public class removeDuplicatesfromSortedArray2 {

	public static void main(String[] args) {	

		int[] numsArr = new int[] {0,0,1,1,1,2,2,3,3,4};
		removeDuplicatesfromSortedArray2 e = new removeDuplicatesfromSortedArray2();
		int arraySize = e.removeVal(numsArr);
		System.out.println(arraySize);
	}

	/*//using HashMap
	public int removeVal(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
	        for(int i = 0; i < nums.length; i++) {
	            if(map.containsKey(nums[i]) && map.get(nums[i]) < 2){
	            	map.put(nums[i], map.get(nums[i])+1);
	            }else if(!map.containsKey(nums[i])){
	                map.put(nums[i], 1);
	            }
	        }
		return map.size();
	}*/
	
	public int removeVal(int[] nums) {
		int i = 0, j = 1, k = 0;
		int count = 1;
		nums[k] = nums[i];
		k++;
		while(i <= nums.length - 1 && j <= nums.length - 1 ) {
			if(nums[i] == nums[j] && count < 2) {
				nums[k] = nums[j];
				k++;
				count ++;
			}else if(nums[i] != nums[j]) {
				nums[k] = nums[j];
				k++;
				count = 1;
			}
			i++;
			j++;
		}
		
		return k;
	}
}