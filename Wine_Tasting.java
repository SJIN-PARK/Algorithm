package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
problem
Hyo-joo went to a wine tasting party. When I went there, there were rows of wine glasses with various wines on the table. 
Hyo-joo wants to taste wine, but there are two rules:

If you choose a wine glass, you must drink all the wine in it and put it back in its original position after drinking.
You cannot drink all three cups in a row.
Hyo-joo is contemplating which wine glass to choose in order to taste as much wine as possible. 
When n wine glasses numbered from 1 to n are placed on the table in order, and the amount of wine in each wine glass is given, 
a program to help Hyo-joo drink the most amount of wine Write it.

For example, if there are 6 wine glasses, and each glass contains 6, 10, 13, 9, 8, 1 wine in order, 
select the first, second, fourth, and fifth wine glasses. If you do, you can drink the maximum amount of wine with a total of 33.

input
The first line gives the number n of wine glasses. (1 ≤ n ≤ 10,000) From the second row to the n+1 row, the amount of wine in the wine glass is given in order. The amount of wine is a nonnegative integer less than or equal to 1,000.

Print
The first line prints the maximum amount of wine you can drink.

예제 입력 1 
6
6
10
13
9
8
1
예제 출력 1 
33

 */



public class Wine_Tasting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		int[] arr = new int[N+1];
		for(int i = 1; i <= N; i++){
			arr[i] = Integer.parseInt(reader.readLine());
		}
		
		int[] dp = new int[N+1];
		dp[1] = arr[1];
		if(N > 1){
			dp[2] = arr[1] + arr[2];
		}
		
		for(int i = 3; i <= N; i++){
			dp[i] = Math.max(dp[i-1], Math.max(arr[i] + dp[i-2], arr[i] + dp[i-3] +arr[i-1]));
			
			System.out.println("==============================");
			System.out.println("arr[i] + arr[i-3] +arr[i-1] : " + (arr[i] + dp[i-3] +arr[i-1]));
			System.out.println("arr[i] + dp[i-2] : " + (arr[i] + dp[i-2]));
			System.out.println("dp[i-1] : " + dp[i-1]);
			
			System.out.println("dp["+i+"] : " + dp[i]);
		}
		
		System.out.println("Result : " + dp[N]);
		
	}

}
