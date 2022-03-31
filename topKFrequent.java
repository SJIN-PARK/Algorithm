package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*

347. Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 
Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 
Constraints:

1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.

*/

public class topKFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int k = 1;
		int[] result = new int[k];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			int key_size = 0;
			if(map.containsKey(nums[i])){
				key_size = map.get(nums[i]);
				map.put(nums[i], key_size + 1);
			}else{
				map.put(nums[i], 1);
			}
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
		    @Override
		    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
		    	return o2.getValue() - o1.getValue();
		    }
		});
		int count = 0;
		for(Map.Entry<Integer, Integer> entry : entryList){
			result[count] = entry.getKey();
			count++;
			if(count == k){
				break;
			}		
			//System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
		
		System.out.println(Arrays.toString(result));
			
	}

}
