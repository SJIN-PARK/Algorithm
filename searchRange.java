package LeetCode;

import java.util.Arrays;
import java.util.LinkedHashMap;

/*
34. Find First and Last Position of Element in Sorted Array
Medium

9482

274

Add to List

Share
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 
Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */

public class searchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,2};
		int target = 2;
		
		int[] result = new int[2];
		int count = 0;
		int start = -1;
		int end = -1;
		boolean findflag = false;
		
		if(nums.length == 0){
			result[0] = start;
			result[1] = end;
			System.out.println("Result : " + Arrays.toString(result));
		}
		
		if(nums.length == 1){
            if(nums[0] == target){
                result[0] = 0;
			    result[1] = 0;
			    System.out.println("Result : " + Arrays.toString(result));
            }else{
                result[0] = start;
			    result[1] = end;
			    System.out.println("Result : " + Arrays.toString(result));
            }   
        }
		
		for(int i = 0; i < nums.length; i++){
			
			if(target < nums[i]){
				if(findflag){
					end = i - 1;
					break;
				}else{
					break;
				}
			}else if(target == nums[i]){
				if(!findflag){
					findflag = true;
					start = i;
					System.out.println("i : " + i);
				}
				
			}
			
			if(i == nums.length - 1 && target == nums[i]){
				if(findflag){
					end = i;
					break;
				}
			}
		}
		
		result[0] = start;
		result[1] = end;
		
		System.out.println("Result : " + Arrays.toString(result));
		

	}

}
