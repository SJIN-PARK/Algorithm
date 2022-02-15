package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number_Card_II {
	
	static int[] arr;
	static HashMap<Integer, Integer> map = new HashMap<>();
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				int value = map.get(arr[i]).intValue();
				map.put(arr[i], value + 1);
			}
		}
		
		Arrays.sort(arr);
		//System.out.println("arr : " + Arrays.toString(arr));
		
		int M = Integer.parseInt(reader.readLine());
		StringTokenizer st1 = new StringTokenizer(reader.readLine(), " ");
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < M; i++){
			int count = BinarySearch(Integer.parseInt(st1.nextToken()));
			sb.append(count).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static int BinarySearch(int val){
		
		int count = 0;
		
		int lo = 0;					// Å½»ö ¹üÀ§ÀÇ ¿ÞÂÊ ³¡ ÀÎµ¦½º
		int hi = arr.length - 1;	// Å½»ö ¹üÀ§ÀÇ ¿À¸¥ÂÊ ³¡ ÀÎµ¦½º
			
		while(lo <= hi){
			
			int mid = (lo + hi) / 2;
			
			if( val < arr[mid]){
				hi = mid - 1;
			}
			
			else if( val > arr[mid]){
				lo = mid + 1;
			}
			
			else{
				count = map.get(val).intValue();			
				return count;
			}
			
		}
		
		return count;
	}
}
