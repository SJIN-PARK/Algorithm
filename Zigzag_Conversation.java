package LeetCode;

import java.util.Arrays;

/*
6. Zigzag Conversion 
  
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

P   A   H   N
A P L S I I G
Y   I   R

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:

Input: s = "A", numRows = 1
Output: "A"
 
 
 */

public class Zigzag_Conversation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int numRows = 4;
		
		StringBuilder result = new StringBuilder();

        /* String to Array */
        String[] arr = s.split("");
        int[] dp = new int[arr.length];

        int index = 0; // 0,1,2,3,2,1,0,1,2,3,2,1,0,1
        boolean isAdded = true;
        int value = 0;

        /* dp array setting */
        while (index < arr.length) {
            dp[index] = value;

            if (value + 1 == numRows) { // value°¡ ÃÖ´ëÄ¡¸é »¬¼À
                isAdded = false;
            } else if (value == 0) { // value °¡ 0ÀÌ¸é µ¡¼À
                isAdded = true;
            }

            if (!isAdded) {
                value = value - 1;
            } else {
                value = value + 1;
            }

            index++;
        }
        
        System.out.println("DP : " + Arrays.toString(dp));

        int order = 0;
        while (order < numRows) {
        	System.out.println("order : " + order);
            for (int i = 0; i < dp.length; i++) {
                if (dp[i] == order) { // 0, 1, 2 ¼øÀ¸·Î Ã£¾Æ¼­ ¹®ÀÚ¿­ append
                    result.append(arr[i]);
                }
            }

            order++;
        }

        System.out.println(result.toString());

	}

}
