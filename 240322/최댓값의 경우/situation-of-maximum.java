import java.util.*;
import java.io.*;

public class Main {

    static public class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] dp = new int[d + 1];
        Pair[] pairs = new Pair[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            pairs[i]=new Pair(a, b);
        }
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                if(a.x == b.x) {
                    return b.y - a.y;
                }
                return a.x - b.x;
            }
        });

        Arrays.fill(dp, -1);
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = d; j>=pairs[i].x; j--) {
                if(dp[j - pairs[i].x] != -1 || j == pairs[i].x) {
                    dp[j] = Math.max(dp[j], pairs[i].y);
                }
            }
            max = Math.max(dp[d], max);
        }


        System.out.println(max);        
        // 여기에 코드를 작성해주세요.
    }

    
}