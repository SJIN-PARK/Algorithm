package LeetCode;

/*
128. Longest Consecutive Sequence

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
import java.util.HashSet;
import java.util.TreeSet;

public class longestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,0,1};
		
		TreeSet<Integer> t_set = new TreeSet<>();
			
		for(int i = 0; i < nums.length; i++){
			t_set.add(nums[i]);
		}
		
		int minVal = t_set.first();
		int longest_len = 1;
		int temp_len = 1;
		
		
		for(int i = 0; i < nums.length; i++){
			if(t_set.contains(minVal + 1)){
				temp_len++;
				minVal += 1;
			}else{
				longest_len = Math.max(longest_len, temp_len);
				if(t_set.higher(minVal) == null){
					break;
				}
				minVal = t_set.higher(minVal);
				temp_len = 1;
			}
		}
		
		longest_len = Math.max(longest_len, temp_len);
		
		System.out.println("longest_len : " + longest_len);

	}
	
			
}
