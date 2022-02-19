package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
problem
Sejun made an expression with positive numbers, +, -, and parentheses. Then, Sejun erased all parentheses.
Then, Sejun tries to minimize the value of this expression by appropriately putting parentheses.

Write a program that minimizes the value of this expression by putting appropriate parentheses.

input
The expression is given in the first line. The expression consists of only ‘0’ to ‘9’, ‘+’, and ‘-’, and the first and last characters are numbers. 
And no two or more operators appear in a row, and no number has more than 5 consecutive digits. 
Numbers can start with 0. The length of the expression given as input is less than or equal to 50.

Print
Print the answer on the first line.

예제 입력 1 
55-50+40
예제 출력 1 
-35

예제 입력 2 
10+20+30+40
예제 출력 2 
100

예제 입력 3 
00009-00009
예제 출력 3 
0
 */

public class Missing_Bracket {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine(),"-");
		
		int total = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()){
			
			int subSum = 0;
			
			StringTokenizer stSub = new StringTokenizer(st.nextToken(), "+");
			while(stSub.hasMoreTokens()){
				subSum += Integer.parseInt(stSub.nextToken());
			}
			
			if(total == Integer.MAX_VALUE){
				total = subSum;
			}else{
				total -= subSum;
			}
		}
		
		System.out.println("Total : " + total);
		
	}
}
