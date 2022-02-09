package BaekJoon;

public class MakeOne {

	static Integer[] dp;
	static int pr_cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		dp = new Integer[N + 1] ; // 메모이제이션 할 배열
		dp[0] = dp[1] = 0;
		
		int count = recur(N);
		
		 
		System.out.println("Least Count : " + count);
	}
	
	static int recur(int N) {
		 
		pr_cnt++;
		System.out.println("N value : " + N);
		
		if (dp[N] == null) {
					
			
			// 6으로 나눠지는 경우 
			if (N % 6 == 0) {
				System.out.println("Try6B : " + pr_cnt);
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
				System.out.println("Try6A : " + pr_cnt);
			}
			// 3으로만 나눠지는 경우 
			else if (N % 3 == 0) {
				System.out.println("Try3B : " + pr_cnt);
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
				System.out.println("Try3A : " + pr_cnt);
			}
			// 2로만 나눠지는 경우 
			else if (N % 2 == 0) {
				System.out.println("Try2B : " + pr_cnt);
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
				System.out.println("Try2A : " + pr_cnt);
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				System.out.println("ElseB : " + pr_cnt);
				dp[N] = recur(N - 1) + 1;
				System.out.println("ElseA : " + pr_cnt);
			}
		}
		System.out.println("Not null : " + pr_cnt);
		return dp[N];
	}
	
	

}
