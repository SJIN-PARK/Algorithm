package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
problem
If a sequence S satisfies S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN with respect to a certain number Sk, 
the sequence is called a bitonic sequence.

For example, {10, 20, 30, 25, 20} and {10, 20, 30, 40}, {50, 40, 25, 10} are bitonic sequences, 
but {1, 2, 3, 2, 1, 2, 3, 2, 1} and {10, 20, 30, 40, 20, 30} are not bitonic sequences.

Given a sequence A, write a program to find the length of the longest bitonic sequence among the subsequences of the sequence.

input
The size N of the sequence A is given in the first line, and the Ai constituting the sequence A is given in the second line. 
(1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)

Print
In the first line, the length of the longest bitonic sequence among the subsequences of sequence A is printed.

예제 입력 1 
10
1 5 2 1 4 3 4 5 2 1
예제 출력 1 
7

 */

public class Longest_Bitonic_Subsequence  {

	static int[] dp;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 0;
			
		}
		
		for(int i = 0; i < N; i++){
			subseq(arr[i], i);
			System.out.println("arr["+i+"]" + arr[i]);
			System.out.println("dp["+i+"]" + Arrays.toString(dp));
		}
		
	}
	
	public static void subseq(int value, int digit){
		
		//left
		for(int i = 0; i < digit; i++){
			if(value >= arr[i] && arr[i] <= arr[i+1]){
				dp[i]++;
			}else{
				break;
			}
		}
		
		//right
		for(int i = arr.length - 1; i > digit; i++){
			if(value >= arr[i] && arr[i] <= arr[i-1]){
				dp[i]++;
			}else{
				break;
			}
		}
	}

}
