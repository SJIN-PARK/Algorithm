package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.html.ListView;

/*
 * 
207. Course Schedule

There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.

Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 

Constraints:

1 <= numCourses <= 105
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
 */

public class canFinishCourse1 {

	static int numCourses = 3;
	static int[][] prerequisites = {{1,0},{0,2},{2,1}};
	
	static boolean[] dp_visit = new boolean[prerequisites.length];
	static boolean[] temp_stack = new boolean[prerequisites.length];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		boolean flag = true;
		
		
		for(int i = 0; i < prerequisites.length; i++){
			int key = 0;
			int value = 0;
			List<Integer> val_list = new ArrayList<Integer>();;
			for(int j = 0; j < 2; j++){
				key = prerequisites[i][0];
				value = prerequisites[i][1];
			}
			
			if(map.containsKey(key)){
				val_list = map.get(key);
				val_list.add(value);
				map.put(key, val_list);
			}else{
				val_list.add(value);
				map.put(key, val_list);
			}
		}
		
		for(int i = 0; i < prerequisites.length; i++){
			int value = prerequisites[i][1];
			if(!dp_visit[value]){
				if(!checkValid(map, value, dp_visit, temp_stack)){
					flag = false;
					break;
				}
			}
		}
		
		System.out.println("Result : " + flag);
							
	}
	
	public static boolean checkValid(HashMap<Integer, List<Integer>> map, int course_seq, boolean[] dp_visit, boolean[] temp_stack){
		dp_visit[course_seq] = true;
		temp_stack[course_seq] = true;
		
		List<Integer> map_list = map.get(course_seq);
		
		for(int i = 0; i < map_list.size(); i++){
			int listVal = map_list.get(i);
			if(temp_stack[listVal]) return false;
			
			if(!dp_visit[listVal]){
				if(!checkValid(map, listVal, dp_visit, temp_stack)){
					return false;
				}
			}
		}
		
//		for(int listVal : map_list){
//			if(temp_stack[listVal]) return false;
//			
//			if(!dp_visit[listVal]){
//				if(!checkValid(map, listVal, dp_visit, temp_stack)){
//					return false;
//				}
//			}
//		}
		
		temp_stack[course_seq] = false;
		
		return true;
	}

}
