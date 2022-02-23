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

	static int[] dp_L;
	static int[] dp_R;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		arr = new int[N];
		dp_L = new int[N]; //LDS
		dp_R = new int[N]; //LIS
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//calculate LIS, LDS
		subseq(N);
		
		int max_len = 0;
		for(int i = 0; i < N; i++){
			if(max_len < dp_R[i] + dp_L[i]){
				max_len = dp_R[i] + dp_L[i];
			}
		}
		
		max_len = max_len - 1;
		System.out.println("Result : " + max_len);
		
	}
		
	public static void subseq(int length){
		
		//LIS 
		//1 5 2 1 4 3 4 5 2 1
		//1 2 2 1 3 3 4 5 2 1
		for(int i = 0; i < length; i++){
			dp_R[i] = 1;	
			for(int j = 0; j < i; j++){
//				System.out.println("=======================");
//				System.out.println("arr["+i+"] : " + arr[i] );
//				System.out.println("arr["+j+"] : " + arr[j] );
//				System.out.println("dp_R["+i+"] : " + dp_R[i] );
//				System.out.println("dp_R["+j+"] : " + dp_R[j] );
//				System.out.println("dp_R["+j+"]+1 : " + (dp_R[j]+1) );
				if(arr[i] > arr[j] && dp_R[i] < dp_R[j]+1){
					dp_R[i] = dp_R[j]+1;
					
				}
//				System.out.println("dp_R["+i+"] : " + dp_R[i] );
			}
		}
		
		//LDS
		//1 5 2 1 4 3 4 5 2 1
		//1 5 2 1 4 3 3 3 2 1
		for(int i = length - 1; i >= 0; i--){
			dp_L[i] = 1;
			for(int j = length - 1; j > i; j--){
//				System.out.println("=======================");
//				System.out.println("arr["+i+"] : " + arr[i] );
//				System.out.println("arr["+j+"] : " + arr[j] );
//				System.out.println("dp_L["+i+"] : " + dp_L[i] );
//				System.out.println("dp_L["+j+"] : " + dp_L[j] );
//				System.out.println("dp_L["+j+"]+1 : " + (dp_L[j]+1) );
				if(arr[i] > arr[j] && dp_L[i] < dp_L[j] + 1){
					dp_L[i] = dp_L[j] + 1;
				}
//				System.out.println("dp_L["+i+"] : " + dp_L[i] );
			}
		}
		
	}

}
