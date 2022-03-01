package LeetCode;

/*
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
 */

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String int_s = Integer.toString(-563847412);
		String res_s = "";
		String max_s = Integer.toString(Integer.MAX_VALUE);
		String min_s = Integer.toString(Integer.MIN_VALUE);
		
		int negative = 0;
		if(int_s.indexOf("-") > -1){
			negative = 1;
			res_s = "-";
		}
		
		for(int i = int_s.length()-1; i >= 0 + negative; i--){
			res_s += Character.toString(int_s.charAt(i));
		}
		System.out.println(res_s);
		System.out.println(max_s);
		System.out.println(min_s);
		
		if(int_s.indexOf("-") > -1 && int_s.length() == 11){
			if(res_s.compareTo(min_s) > -1){
				res_s = "0";
			}
		}else{
			if(res_s.compareTo(max_s) > -1 && int_s.length() == 10){
				res_s = "0";
			}
		}
		
		System.out.println("Result : "+ res_s);
		
		

	}

}
