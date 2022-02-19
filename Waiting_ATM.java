package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 Problem
Inha Bank only has one ATM. Now there are N people lining up in front of this ATM. 
People are numbered from 1 to N, and the time it takes for person i to withdraw money is Pi minutes.
Depending on the order in which people line up, the amount of time required to withdraw money varies. 
For example, consider the case where there are a total of 5 people, P1 = 3, P2 = 1, P3 = 4, P4 = 3, P5 = 2. 
If you line up in the order [1, 2, 3, 4, 5], person 1 can draw money in 3 minutes. 
Since person 2 has to wait for person 1 to draw money, it will take 3+1 = 4 minutes. 
Since Person 3 has to wait for Persons 1 and 2 to draw money, a total of 3+1+4 = 8 minutes is required. 
Person 4 takes 3+1+4+3 = 11 minutes, Person 5 takes 3+1+4+3+2 = 13 minutes. 
In this case, the sum of the time required for each person to withdraw money is 3+4+8+11+13 = 39 minutes.

If you line up in [2, 5, 1, 4, 3] order, person 2 takes 1 minute, person 5 takes 1+2 = 3 minutes
, person 1 takes 1+2+3 = 6 minutes. , person 4 takes 1+2+3+3 = 9 minutes, person 3 takes 1+2+3+3+4 = 13 minutes. 
The sum of the time required for each person to withdraw money is 1+3+6+9+13 = 32 minutes. 
It is impossible to minimize the sum of the time required more than this method.

Write a program to find the minimum sum of the time required for each person to withdraw money, 
given the number of people in line N and the time it takes each person to withdraw money Pi.

input
The first line gives the number of people N (1 ¡Â N ¡Â 1,000). 
The second line gives the time Pi it takes each person to withdraw money. (1 ¡Â Pi ¡Â 1,000)

Print
In the first line, we print the minimum sum of the time required for each person to withdraw money.

===================================================================================================

input example
5
3 1 4 3 2

output example
32
*/

public class Waiting_ATM{
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++ ){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		int prev_sum = 0;
		
		for(int i = 0; i < N; i++ ){
			sum += arr[i] + prev_sum;
			prev_sum += arr[i];
		}
		
		System.out.println("Total time : " + sum);
		
	}
}
