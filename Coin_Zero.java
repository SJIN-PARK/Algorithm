/*
Problem
Junkyu has a total of N types of coins, and he has a lot of each of them.

We try to use the coins appropriately so that the sum of their values is K.
Write a program to find the minimum value of the required number of coins.

input
In the first line N and K are given. (1 ¡Â N ¡Â 10, 1 ¡Â K ¡Â 100,000,000)
From the second row to the N rows, the coin values Ai are given in ascending order. 
(If 1 ¡Â Ai ¡Â 1,000,000, A1 = 1, and i ¡Ã 2, then Ai is a multiple of Ai-1)

Print
In the first line, we print the minimum number of coins required to make K won.
 */
package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin_Zero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(reader.readLine());
		}
		int count = 0;

		for(int i = N - 1; i >= 0; i--){
			if(arr[i] <= K){
				count += K / arr[i];
				K = K % arr[i];
				if(K == 0) break;
			}
		}
		System.out.println("Coin Count : " + count);
		
		
	}

}
