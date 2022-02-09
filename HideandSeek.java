package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideandSeek {

	static int stoi(String s) {
        return Integer.parseInt(s);
    }

    static class Node {
        int index, distance;

        Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        List[] nodes = new ArrayList[N+1];

        for(int i=0; i<N+1; i++) {
            nodes[i] = new ArrayList();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int v1 = stoi(st.nextToken());
            int v2 = stoi(st.nextToken());

            nodes[v1].add(v2);
            nodes[v2].add(v1);
        }

        // ���߿� ����� 3��
        int number = 2;
        int maxDistance = -1;
        int count = 1;

        // BFS ����
        Queue q = new LinkedList();
        boolean[] visited = new boolean[N+1];

        q.add(new Node(1, 0));
        visited[1] = true;

        while(!q.isEmpty()) {
            Node now = (Node) q.poll();

            if(maxDistance < now.distance) {
                maxDistance = now.distance;
                number = now.index;
                count = 1;
            }
            // �ִ�Ÿ��� ���� �ֵ��� ī��Ʈ����
            else if(maxDistance == now.distance) {
                count++;

                // ���� ���� �갣���� ����
                if(number > now.index)
                    number = now.index;
            }

            for(Integer next : nodes[now.index]) {
                if(visited[next])
                    continue;
                
                q.add(new Node(next, now.distance+1));
                visited[next] = true;
            }
        }

        // ���
        StringBuilder sb = new StringBuilder();
        sb.append(number + " " + maxDistance + " " + count);
        System.out.println(sb);
    }

}
