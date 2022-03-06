package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example 1:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Example 2:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Example 3:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

Constraints:

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 */

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
		String word = "ABCCED";		
		int n = board.length; //row
		int m = board[0].length; // column
		
		HashMap<String, Integer> wordMap = new HashMap<>();
		for(int i = 0; i < word.length(); i++){
			String curStr = Character.toString(word.charAt(i));
			if(!wordMap.containsKey(curStr)){
				wordMap.put(curStr, 1);
			}else{
				int count = wordMap.get(curStr);
				wordMap.put(curStr, count + 1);
			}
		}
		
		
		

	}

}
