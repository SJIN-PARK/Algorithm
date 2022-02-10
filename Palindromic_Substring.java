package LeetCode;

/*
5. Longest Palindromic Substring 
 
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"
Output: "bb"
 
 */

public class Palindromic_Substring {
	
	static int[][] strValue;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		
		int maxLength = 0;
		int len = 0;
		String pString = "";
		
		strValue = new int[s.length()][s.length()];
		
		for(int i = 0; i < s.length(); i++){
			for(int j = i; j < s.length(); j++){
				len = j - i + 1;
				
				int ret = calc(s, i, j);
				
				if(ret == 1){
					if(maxLength < len){
						maxLength = len;
						pString = s.substring(i,j+1);
						
					}
				}
			}
		}
		System.out.println("String : " + pString);
		

	}
	
	public static int calc(String s, int start, int end){
		int calcVal = -1;
		
		if(start >= end){
			return 1;
		}
		
		if(strValue[start][end] != 0){
			return strValue[start][end];
		}
		
		if(s.charAt(start) == s.charAt(end)){
			calcVal = calc(s, start + 1, end - 1);			
		}
		
		strValue[start][end] = calcVal;
			
		return calcVal;
	}

}
