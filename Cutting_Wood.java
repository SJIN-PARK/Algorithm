package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cutting_Wood {
	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(reader.readLine(), " ");
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(arr);
		
		int max = arr[arr.length-1] + 1;
		int min = 0;
		int mid = 0;
		
		while(min < max){
			
			mid = (min + max) / 2;
			long count = 0;
			
			for(int i = 0; i < arr.length; i++){
				if(arr[i] - mid > 0){
					count += (arr[i] - mid);
				}
			}
			
			if( count < M){
				max = mid;
			}
			
			else{
				min = mid + 1;
			}
		}
		
		System.out.println("Max Height : " + (min - 1));
		
	}
}
