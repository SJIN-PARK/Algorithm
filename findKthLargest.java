package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*

215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 
Constraints:

1 <= k <= nums.length <= 104
-104 <= nums[i] <= 104
 */

public class findKthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		int length = nums.length;
		int findLength = length - k;
		int KthLargest = 0;
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < length; i++){
			
			int element_cnt = 0;
			if(map.containsKey(nums[i])){
				element_cnt = map.get(nums[i]);
				map.put(nums[i], element_cnt + 1);
			}else{
				map.put(nums[i], 1);
			}
		}
		
		int maxElement = map.lastKey();
		for(int i = 0; i < map.size(); i++){
			int key_size = map.get(maxElement);
			length -= key_size;
			if(length <= findLength) {
				KthLargest = maxElement;
				break;
			}
			
			maxElement = map.lowerKey(maxElement);
		}
		
		System.out.println("KthLargest : " + KthLargest);
	}

}
