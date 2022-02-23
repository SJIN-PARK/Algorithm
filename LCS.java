package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
problem
The Longest Common Subsequence (LCS) problem is a problem of finding the longest among sequences 
that are both subsequences when two sequences are given.

For example, the LCS of ACAYKP and CAPCAK becomes ACAK.

input
Two strings are given in the first and second lines. The character string consists only of uppercase letters of the alphabet 
and has a maximum of 1000 characters.

Print
Outputs the length of the LCS of the two strings given as input in the first line.

Example input 1
ACAYKP
CAPCAK
Example output 1
4

  ACAYKP
C 011111
A 112222
P 112223
C 122223
A 123333
K 123344
*/

public class LCS {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String strA = reader.readLine();
		String strB = reader.readLine();
		int length = strA.length();
		int [][] dp = new int[length+1][length+1];
		
		int result_len = 0;
		
		for(int i = 1; i <= length; i++){
			for(int j = 1; j <= length; j++){
				if(strA.charAt(i-1) == strB.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1]+1;
					result_len = dp[i][j];
				}else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println("dp : " + Arrays.deepToString(dp));
		System.out.println("Result : " + dp[length][length]);
		
	}
}
