import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] map = new int[N + 1];
        Arrays.fill(map, 1);
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            pq.add(new Pair(Math.min(a, b), Math.max(a, b)));
        }

        while(!pq.isEmpty()) {
            Pair temp = pq.poll();
            int first = temp.first;
            int second = temp.second;
            // System.out.println(first + " " + second);

            if(map[first] == map[second])
                map[second]++;
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(map[i]);
        }

        // 여기에 코드를 작성해주세요.
    }
    static class Pair implements Comparable<Pair>{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o1) {
            if(o1.first == this.first) {
                return this.second - o1.second;
            }
            return this.first - o1.first;
        }
    }
}