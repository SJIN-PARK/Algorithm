package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numCourses = 3;
		int[][] prerequisites = {{1,0},{0,2},{2,1}};
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
			int key = 0;
			int value = 0;
			List<Integer> val_list = new ArrayList<Integer>();;
			for(int j = 0; j < 2; j++){
				key = prerequisites[i][0];
				value = prerequisites[i][1];
			}
			
			if(map.containsKey(value)){
				val_list = map.get(value);
				for(int l = 0; l < val_list.size(); l++){
					int listVal = val_list.get(l);
					if(listVal == key){
						flag = false;
						break;
					}
				}
			}
			
			if(!flag) break;
			
		}
		
		System.out.println("result : " + flag);
		
		
		

	}

}
