package LeetCode;

import java.util.Arrays;

/*
 * 
179. Largest Number

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 
Example 1:

Input: nums = [10,2]
Output: "210"

Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109


 */

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,30,34,5,9};
		
		int total_length = 0;
		
		for(int i = 0; i < nums.length; i++){
			String s = Integer.toString(nums[i]);
			int length = s.length();
			total_length += length;
		}
		
		char[] num = new char[total_length];
		int k = 0;
		for(int i = 0; i < nums.length; i++){
			String s = Integer.toString(nums[i]);
			//System.out.println(" s : " + s);
			
			for(int j = 0; j < s.length(); j++){
				num[k] = s.charAt(j); 
				//System.out.println(" k : " + k);
				//System.out.println(Arrays.toString(num));
				k++;
			}
//			
			
		}
		
		Arrays.sort(num);
		String result = "";
		for(int i = num.length - 1; i >=0; i--){
			result += Character.toString(num[i]);
		}
		
		System.out.println(result);
		

	}

}
