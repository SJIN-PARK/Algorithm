package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kth_number {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int K = Integer.parseInt(reader.readLine());
		
		/*
		 * use multiplication table
		 * when N = 3 and k = 5 then the find count meets condition number which is smaller than or equal with 3
		 | 1,2,3 |
		 | 2,    |
		 | 3     |
		 * k value is same with sum of share 
		 *  1 : {1, 2, 3, 4, 5, 6, 7, 8, 9}

			2 : {2, 4, 6, 8, 10, 12, 14, 16, 18}
			  
			3 : {3, 6, 9, 12, 15, 18, 21, 24, 27}
			  
			4 : {4, 8, 12, 16, 20, 24, 28, 32, 36}
			  
			5 : {5, 10, 15, 20, 25, 30, 35, 40, 45}
			  
			6 : {6, 12, 18, 24, 30, 36, 42, 48, 54}
			  
			7 : {7, 14 ,21 ,28, 35, 42, 49, 56, 63}
			  
			8 : {8, 16, 24, 32, 40, 48, 56, 64, 72}
			  
			9 : {9, 18, 27, 36, 45, 54, 63, 72, 81}
		 */
		
		int min = 1;
		int max = K;
		int mid = 0;
		
		while(min < max){
			
			int sum = 0;
			
			mid = (min + max) / 2;
			
			for(int i = 1; i <= N; i++){
				sum += Math.min(mid/i, N);
			}
			
			if( K <= sum){
				max = mid;
			}
			else{
				min = mid + 1;
			}
			
			
		}
		System.out.println("Kth Number : " + min);

	}

}
