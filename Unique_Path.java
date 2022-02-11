package LeetCode;

public class Unique_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 7;
		int[][] dp = new int[m][n];
        // base case for finish point only 2 paths
        // or start point as base case, only 2 paths as well
        
        // just straight line
        //if(m < 2 || n < 2 ) return 1;
        dp[0][1] = 1; // move right
        dp[1][0] = 1; // move down
        dp[0][0] = 1;
        
        //dp[x][y] = dp[x-1][y] + dp[x][y-1]
        
        for(int x = 0; x < m; x++) {
            for(int y = 0; y < n; y++) {
                if(dp[x][y] > 0) continue;
                int top = x-1 >= 0 ? dp[x-1][y]: 0;
                int left = y-1 >= 0 ? dp[x][y-1]: 0;
                dp[x][y] = top + left;
            }
        }
		
		System.out.println(dp[m-1][n-1]);
	}

}
