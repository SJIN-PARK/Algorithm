package LeetCode;

/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jump_Game_II {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		int lastindex = nums.length;
//		int min_attempt = 0;
//		
//		if(nums.length == 0){
//			min_attempt = 0;
//		}
//		
//		// 2 3 1 1 4
//		// 2 -> 3, 3 -> 4
//		if(nums[0] >= nums[lastindex-1]){
//			min_attempt = 1;
//		}
//		
//		int pre_index = 0;
//		int can_go = nums[0];
//		int inc_index = 0;
//		int remain = nums[lastindex-1] - nums[0];
//
//		while(remain > 0){
//			int cur_val = 0;
//			for(int i = 1; i <= can_go; i++ ){
//				if(cur_val <= nums[pre_index] + nums[pre_index + i]){
//					cur_val = nums[pre_index] + nums[pre_index + i];
//					inc_index++;
//				}
//			}
//			
//			remain -= nums[pre_index+inc_index];
//			min_attempt++;
//		}
//		
//		System.out.println("Result : " + min_attempt);
		
//		for(int i = 1; i < lastindex; i++){
//			dp[i] = 1;
//			for(int j = i; j < i + nums[i]; j++){
//				if(dp[i] <= dp[i-1] + nums[j]){
//					dp[i] = Math.max(dp[i], dp[i-1] + nums[j]);
//				}
//			}
//		}
		
		int farthestReachablePos = 0, curFarthestReachablePos = 0, jumpStep = 0, n = nums.length;
        
        // Iterate through nums
        for (int i = 0; i < n - 1 ; i++) {
            // Update current farthest reachable position from i
            int jump = nums[i];
            curFarthestReachablePos = Math.max(curFarthestReachablePos, jump + i);
            
            // If we are at the farthest reachable position
            if (i == farthestReachablePos) {
                ++jumpStep;
                // Update farthest reachable position
                farthestReachablePos = curFarthestReachablePos;
                
                // If farthest reachable position is out of range, break
                if (farthestReachablePos >= n - 1){
                	//return jumpStep;
                	System.out.println("Step Count : " + jumpStep);
                }
            }
        }

        //return jumpStep;
        System.out.println("Step Count : " + jumpStep);
		
		
		
	}

}
