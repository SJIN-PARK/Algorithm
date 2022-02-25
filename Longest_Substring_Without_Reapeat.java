package LeetCode;

import java.util.HashMap;

/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

public class Longest_Substring_Without_Reapeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		int length = s.length();
		int max_length = 0;
		
		if(length == 1){
            max_length = 1;
        }
		
		for(int i = 0; i < length; i++){
			HashMap<Character, Integer> map = new HashMap<>();
			for(int j = i; j < length; j++){
				System.out.println("s.charAt(j) : " + s.charAt(j));
				
				if(!map.containsKey(s.charAt(j))){
					map.put(s.charAt(j), j);
					max_length = Math.max(max_length, j - i + 1);
				}
				else{
					max_length = Math.max(max_length, j - i);
					System.out.println("index : " + (j - i));
					break;
				}
			}
		}
		
		System.out.println("Result : " + max_length);
		

	}

}
