package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class getMaxLan {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int K = 0;
		int N = 0;
		
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[K];
		
		for(int i = 0; i < K; i++){
			arr[i] = Integer.parseInt(reader.readLine());
		}
		
		Arrays.sort(arr);
		
		int min = 0;
		// max should be arr[arr.length-1] + 1 for preventing division by 0
		int max = arr[arr.length-1] + 1;
		int mid = 0;
		long qty = 0;
		
		while(min < max){
			
			mid = (min + max) / 2;
			
			qty = 0;
			for(int i = 0; i < arr.length; i++){
				qty += arr[i] / mid;
			}
			
			if( qty < N){
				max = mid;
			}
			
			else{
				min = mid + 1;
			}
			
		}
		System.out.println(" Value : " + (min - 1));
		
		
		
		
	}

}
