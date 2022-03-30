package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		int[] nums = {111311, 1113};
		
		String[] strArr = new String[nums.length];
		for(int i = 0; i < strArr.length; i++){
			strArr[i] = Integer.toString(nums[i]);
		}
		
		Arrays.sort(strArr, new Comparator<String>(){
			
			public int compare(String o1, String o2){
								
				System.out.println("o1 : " + o1);
				System.out.println("o2 : " + o2);
				
				String first = o1 + o2;
				String second = o2 + o1;
				
				return second.compareTo(first);
			}
		});
		
		System.out.println(Arrays.toString(strArr));
		
		
		String streamSortASC = Stream.of(strArr).sorted().collect(Collectors.joining()); //오름차순  
		String streamSortDESC = Stream.of(strArr).sorted(Comparator.reverseOrder()).collect(Collectors.joining()); // 내림차순 
		
		//Lambda 
		String streamSortASC_Lambda = Stream.of(strArr).sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.joining()); //오름차순 
		String streamSortDESC_Lambda = Stream.of(strArr).sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.joining()); // 내림차순

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < strArr.length; i++){
			sb.append(strArr[i]);
		}
		
		if(sb.toString().startsWith("0")){
			return "0";
		}
		
		System.out.println(sb.toString());

	}

}
