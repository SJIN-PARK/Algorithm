package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class HideandSeek4 {

	static int N, K;
    static int[] parent = new int[100001];
    static int[] time = new int[100001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs();

        // 순서대로 구하기 위해 stack 에 담았다가 다시 pop
        Stack<Integer> stack = new Stack<>();
        stack.push(K);
        int index = K;
        
        //System.out.println(Arrays.toString(parent));

        while (index != N) {
            stack.push(parent[index]);
            System.out.println(stack.toString());
            index = parent[index];
        }

        // 최종 출력
        sb.append(time[K] - 1 + "\n");
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }

        System.out.println(sb.toString());
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(N);
        time[N] = 1;
        int count = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == K) return;
            
            System.out.println(" ==============================");
            //System.out.println(" count : " + count++ );
            System.out.println(" now value : " + now );
            for (int i=0; i<3; i++) {
            	
                int next;

                if (i == 0)         next = now + 1;
                else if (i == 1)    next = now - 1;
                else                next = now * 2;

                //System.out.println(" next value : " + next );
                
                if (next < 0 || next > 100000) continue;

                if (time[next] == 0) {
                    q.add(next);
                    time[next] = time[now] + 1;
                    parent[next] = now;
                    System.out.println(" parent["+next+"] : " + now );
                }
                //System.out.println(" time[next] : " + time[next] );
                
                
                //System.out.println(" Q : " + q.toString());
            }
        }
    }

}
