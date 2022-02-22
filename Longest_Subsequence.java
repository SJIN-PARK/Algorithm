package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/*
problem
Given a sequence A, write a program to find the longest increasing subsequence.

For example, if the sequence A = {10, 20, 10, 30, 20, 50} then the longest increasing subsequence is A = {10, 20, 10, 30, 20, 50} , 
with length 4 am.

input
The first line gives the size N (1 �� N �� 1,000) of the sequence A.

The second line is given the Ai constituting the sequence A. (1 �� Ai �� 1,000)

Print
Print the length of the longest increasing subsequence of sequence A on the first line.

���� �Է� 1 
6
10 20 10 30 20 50
���� ��� 1 
4
*/

public class Longest_Subsequence {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		int[] seq = new int[N];
		int[] dp = new int[N];
		
		StringTokenizer st = new StringTokenizer(reader.readLine()," ");
		
		for(int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			dp[i] = 1;
		    
			// 0 ~ i ���� ���ҵ� Ž��
			for(int j = 0; j < i; j++) {
		    
				// j��° ���Ұ� i��° ���Һ��� �����鼭 i��° dp�� j��° dp+1 ������ �������
				
				//System.out.println("dp["+i+"]" + dp[i]);
				//System.out.println("dp["+j+"]" + (dp[j] + 1));
				if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;	// j��° ������ +1 ���� i��° dp�� �ȴ�.
				}
			}
		}
		
		// �ִ�(�ִ� ����) Ž�� 
		int max = -1;
		for(int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
		
	}
}
