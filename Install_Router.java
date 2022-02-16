package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Install_Router {
 
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(reader.readLine());
		}
		
		Arrays.sort(arr);
		
		int max = arr[arr.length - 1];
		int min = 0;
		int mid = 0;
		
		while(min < max){ //upper bound
			
			mid = (min + max) / 2;
			/*
			* If the number of routers that can be installed for the mid distance is less than M
			* Reduce max because we need to narrow the distance.
			*/
			if(calcRouter(mid) < C){
				max = mid;
			}
			
			else{
				/*
				* If the number of routers that can be installed is greater than or equal to the number of M
				* Widen the distance and calculate the maximum distance that the minimum distance can have.
				* Find.
				*/
				
				min = mid + 1;
			}		
		}
		
		System.out.println("Router Length: " + mid);

	}
	
	public static int calcRouter(int mid){
		int distance = 0;
		int count = 1;
		
		for(int i = 1; i < arr.length; i++){
			distance = arr[i] - arr[i - 1];
			
			if(distance >= mid){
				count++;
			}
		}
		
		return count;
	}

}
