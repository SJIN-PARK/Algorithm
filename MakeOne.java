package BaekJoon;

public class MakeOne {

	static Integer[] dp;
	static int pr_cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		dp = new Integer[N + 1] ; // �޸������̼� �� �迭
		dp[0] = dp[1] = 0;
		
		int count = recur(N);
		
		 
		System.out.println("Least Count : " + count);
	}
	
	static int recur(int N) {
		 
		pr_cnt++;
		System.out.println("N value : " + N);
		
		if (dp[N] == null) {
					
			
			// 6���� �������� ��� 
			if (N % 6 == 0) {
				System.out.println("Try6B : " + pr_cnt);
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
				System.out.println("Try6A : " + pr_cnt);
			}
			// 3���θ� �������� ��� 
			else if (N % 3 == 0) {
				System.out.println("Try3B : " + pr_cnt);
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
				System.out.println("Try3A : " + pr_cnt);
			}
			// 2�θ� �������� ��� 
			else if (N % 2 == 0) {
				System.out.println("Try2B : " + pr_cnt);
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
				System.out.println("Try2A : " + pr_cnt);
			}
			// 2�� 3���� ���������� �ʴ� ���
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
