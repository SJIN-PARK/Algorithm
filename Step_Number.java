package BaekJoon;

/*
problem
Let's look at the number 45656.

The difference between all adjacent digits of this number is 1. This number is called the number of steps.

Given N, find the total number of steps of length N. Numbers starting with 0 are not steps.

input
N is given in the first line. N is a natural number greater than or equal to 1 and less than or equal to 100.

Print
In the first line, the remainder of dividing the correct answer by 1,000,000,000 is printed.

예제 입력 1 
1
예제 출력 1 
9
예제 입력 2 
2
예제 출력 2 
17
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Number {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		long mod = 1000000000;
		
		//when N = 2 then step number could be
		//[10],[12],[21],[23],[32],[34],[43],[45],[54],[56],[65],[67],[76],[78],[87],[89],[98]
		
		//when Nth number is 0 then next step number will be only 1
		//when Nth number is 9 then next step number will be only 8
		//when Nth number is from 2 to 9 then next step number will be Nth number + [Nth number - 1], Nth number + [Nth number + 1]
		
		long[][] arr = new long[N+1][10];
		
		//initialize 1st digit
		for(int i = 0; i < 9; i++){
			arr[1][i] = 1;
		}
		
		//bottom-up 
		for(int i = 2; i <= N; i++){
			for(int j = 0; j < 10; j++){
				
				//when Nth number is 0 then next step number will be only 1
				if( j == 0){
					arr[i][j] = arr[i-1][1] % mod; 
				}
				else if( j == 9){
					arr[i][j] = arr[i-1][8] % mod; 
				}
				else{
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % mod;
				}
			}
		}
		
		long sum = 0;
		for(int i = 0; i <= 9; i++){
			sum += arr[N][i];
		}
		
		System.out.println("Result : " + sum);
	}

}
