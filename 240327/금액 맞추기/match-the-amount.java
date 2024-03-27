import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n+1][k+1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++) {
            List<Integer> ll = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            while(st.hasMoreTokens()) {
                int temp = Integer.parseInt(st.nextToken());
                if(!ll.contains(temp)) {
                    ll.add(temp);
                }
            }
            dp[i][0] = 1;
            for(int j = 1; j <= k; j++) {
                dp[i][j] = dp[i-1][j];
                for(int temp : ll) {
                    if(j >= temp) {
                        dp[i][j] += dp[i-1][j-temp];
                        dp[i][j] %= 10007;
                    }
                }
            }
        }
        System.out.println(dp[n][k]);

        // 여기에 코드를 작성해주세요.
    }
}