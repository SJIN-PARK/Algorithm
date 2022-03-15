package LeetCode;

import java.util.Arrays;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.HashMap;

public class longestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,3,2};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int consecutive_cnt = 0;
		int preVal = nums[0];
		int count = 1;
		for(int i = 1; i < nums.length; i++){
			if(preVal == nums[i]){
				continue;
			}else if(nums[i] - preVal == 1){
				count++;
			}else{
				consecutive_cnt = Math.max(consecutive_cnt, count);
				count = 1;
			}
			preVal = nums[i];
		}
		consecutive_cnt = Math.max(consecutive_cnt, count);
			
		System.out.println("consecutive_cnt : " + consecutive_cnt);
	}
			
}
