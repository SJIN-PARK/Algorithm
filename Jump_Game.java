package LeetCode;
/*
You are given an integer array nums. You are initially positioned at the array's first index, 
and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, 
which makes it impossible to reach the last index.
 
Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
 */

public class Jump_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2};
		int length = nums.length;
		int farthestPos = length - 1;
		int curFarthestPos = 0;
			
        if(length == 1){
			System.out.println("Result : " + "True");
		}
        
        if(nums[0] == 0){
        	System.out.println("Result : " + "False");
        }
		
		// Iterate through nums
		// when current jump value == last index - current index
        for (int i = 0; i < length - 1 ; i++) {
            int jump = nums[i];
            curFarthestPos = Math.max(curFarthestPos, i + jump);
            System.out.println("curFarthestPos : " + curFarthestPos);
            
            if(jump == 0){
            	if(curFarthestPos <= i){
            		System.out.println("Result : " + "Break");
            	}
            }
            
            if(curFarthestPos >= farthestPos){
            	System.out.println("Result : " + "True");
            }
            
        }
        System.out.println("Result : " + "False");
	}

}
