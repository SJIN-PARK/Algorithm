package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:

Input: digits = ""
Output: []

Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 
Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */

public class letterCombinations {

	static List<String> result = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "56";
		
		if(digits.equals("")){
			System.out.println(result);
		}
	
		List<String> l = new ArrayList<>();
		l.add("");
		l.add("");
		l.add("abc");
		l.add("edf");
		l.add("ghi");
		l.add("jkl");
		l.add("mno");
		l.add("pqrs");
		l.add("tuv");
		l.add("wxyz");
		l.add("");
		l.add("");
		l.add("");
		
		System.out.println(l.toString());
		
        char[] arr = digits.toCharArray(); // Get individual digits from input
		
		// Now create List like this -> ["abc", "def", "ghi"] if input is 123
        List<String> list = new ArrayList<>();
        for(char i : arr) {
            int x = Character.digit(i, 10);
            list.add(l.get(x));
        }
        
        System.out.println(list.toString());
        System.out.println("List size : " + list.size());
        getCombination("", 0, list);
        
		System.out.println("Combination : " + result.toString());
		
	}
	
	public static void getCombination(String s, int depth, List list){
		
		if(depth == list.size()){
			result.add(s);
			s = "";
			return;
		}
		
		String curStr = list.get(depth).toString();
		System.out.println("curStr : " + curStr);
		char[] arr = curStr.toCharArray();
		for(int i = 0; i < arr.length; i++){
			getCombination(s + arr[i], depth + 1, list);
		}
	}
	


}
