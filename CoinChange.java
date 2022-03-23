package LeetCode;

import java.util.HashSet;
import java.util.TreeSet;

/*
You are given an integer array coins representing coins of different denominations 
and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. 
If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

Example 2:

Input: coins = [2], amount = 3
Output: -1

Example 3:

Input: coins = [1], amount = 0
Output: 0
 

Constraints:

1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104
 */

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2};
		int amount = 3;
		
		int remain = amount;
		
		if(amount == 0){
			remain = 0;
			System.out.println(remain);
		}
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < coins.length; i++){
		//for(int c : coins){
			set.add(coins[i]);
		}

		int count = 0;
		while(remain != 0){
			if(set.contains(remain)){
				remain = 0;
				count++;
			}else if(set.lower(remain) != null){
				remain -= set.lower(remain);
				count++;
			}else{
				count = -1;
				break;
			}
		}
		
		System.out.println("count : " + count);
		
		
	}

}
