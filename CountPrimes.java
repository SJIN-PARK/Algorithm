package LeetCode;

import java.util.Arrays;

/*
204. Count Primes

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 
Constraints:

0 <= n <= 5 * 106
 */

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		int result = 0;
		boolean[] prime = new boolean[n];

		if (n <= 2) {
			result = 0;
		}

		for (int i = 2; i < n; i++) {
			prime[i] = true;
		}
		// Loop's ending condition is i * i < n instead of i < sqrt(n)
		// to avoid repeatedly calling an expensive function sqrt().
		for (int i = 2; i * i < n; i++) {
			if (!prime[i])
				continue;
			for (int j = i * i; j < n; j += i) {
				prime[j] = false;
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (prime[i])
				count++;
		}

		System.out.println("result : " + result);

	}

}
