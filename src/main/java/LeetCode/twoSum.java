/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
package LeetCode;
import java.util.*;
public class twoSum {
	public static int[] calcTwoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else {
                map.put(nums[i], i);
            }
        }
        //throw new IllegalArgumentException("No two sum solution.");
        //return new int[]{-1,-1};
        return null;
    }
	public static void main(String[] args) {
        
		int[] nums = {2,7,11,15};
		int[] twoSum = calcTwoSum(nums, 9);
		
        for(int i = 0; i < twoSum.length; i++) {
        	System.out.println(twoSum[i]);
        }
    }
}