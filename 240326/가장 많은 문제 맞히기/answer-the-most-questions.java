import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int max = 0;
    static List<int[]> ll;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        ll = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ll.add(new int[]{a,b});
        }

        int[][] dp = new int[n+1][t+1];
        for(int i = 1; i <= n; i++) {
            int[] temp = ll.get(i-1);
            for(int j = 1; j <= t; j++) {
                if(j - temp[0] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i-1][j-temp[0]] + temp[1]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][t]);

        // 여기에 코드를 작성해주세요.
    }
}