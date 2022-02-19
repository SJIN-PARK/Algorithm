package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
Problem
There is one conference room, and we want to create a conference room usage table for N meetings that we want to use. 
Given a start time and an end time for each meeting I, let's find the maximum number of meetings that 
can use the conference room without overlapping each meeting. However, once a meeting has started, 
it cannot be stopped in the middle, and the next meeting may start at the same time as one meeting ends. 
The start time and end time of the meeting may be the same. In this case, you can think of it as ending as soon as it starts.

input
The first line gives the number of meetings N (1 ¡Â N ¡Â 100,000). 
From the second line to the N+1 line, the information of each meeting is given, 
and the start time and end time of the meeting are given with a space between them. 
The start time and end time are natural numbers less than or equal to 231-1 or 0.

Print
The first line prints the maximum number of available meetings.

Example input
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14

Example output
4

 */


public class Assign_Room {
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//array sort with comparator
		Arrays.sort(arr, new Comparator<int[]>() {

			
			public int compare(int[] o1, int[] o2) {
				
				//if end time is same, following start time order
				if(o1[1] == o2[1]){
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}	
		});
		
		//System.out.println("Array : " + Arrays.deepToString(arr));
		
		int count = 1;
		int prev_end_time = arr[0][1];

		for(int i = 1; i < N; i++){
			if(prev_end_time <= arr[i][0]){
				count++;
				prev_end_time = arr[i][1];
			}
		}
		
		System.out.println("Assigned room : "  +count);
	}

}
