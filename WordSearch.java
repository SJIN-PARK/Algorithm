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

Input: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = 'ABCCED'
Output: true

Example 2:

Input: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = 'SEE'
Output: true

Example 3:

Input: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = 'ABCB'
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
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCB";		
		int n = board.length; //row
		int m = board[0].length; // column
		boolean result = false;
				
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[0].length; col++){
				
				if(board[row][col] == word.charAt(0)){
					result = findNextLetter(row, col, 0, board, word);
					if(result){
						System.out.println(result);
					}

				}
			}
		}
		
		System.out.println(result);
	}
	
	public static boolean findNextLetter(int row, int col, int letterIndex, char[][] board, String word){
		
		boolean flag = false;
			
		if(row < 0 || col < 0){
			return false;
		}
		if(row >= board.length || col >= board[0].length){
			return false;
		}
		
		if(letterIndex >= word.length()){
			return true;
		}
			
		if(board[row][col] == word.charAt(letterIndex)){
			//System.out.println(board[row][col]);		
			//System.out.println(resStr);		
			
			// check your surroundings
	        char temp = board[row][col];
	        // tell the board you have visited this position
	        board[row][col] = '.';
			
			flag =  findNextLetter(row - 1, col, letterIndex+1, board, word)||
					findNextLetter(row + 1, col, letterIndex+1, board, word)||
					findNextLetter(row, col - 1, letterIndex+1, board, word)||
					findNextLetter(row, col + 1, letterIndex+1, board, word);
			
			board[row][col] = temp;
		}
		
		
		return flag;
		
	}

}
