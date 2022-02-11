package LeetCode;

/*
96. Unique Binary Search Trees
 
Given an integer n, 
return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.

Example 1:

Input: n = 3
Output: 5

Example 2:

Input: n = 1
Output: 1

*/
public class Unique_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// n == 2 => [1,2], [2,1]
		// n == 3 => 1 : [1,2,3],[1,3,2]
		//           2 : [2,1,3]
		//			 3 : [3,2,1],[3,1,2]
		
		int n = 4;
		//array to store the case
		int[] dp = new int[20];
        
		
		dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1;j<=i;++j){
                dp[i] += (dp[j-1] * dp[i-j]);
                System.out.println("dp["+i+"] : " + dp[i]);
            }
		}
	}

}
