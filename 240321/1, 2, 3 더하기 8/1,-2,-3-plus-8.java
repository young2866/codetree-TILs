import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                for(int x = 1; i-x >= 0 && x <= 3; x++) {
                    dp[i][j] = (dp[i][j] + (dp[i - x][j - 1]) % 1000000007) % 1000000007;
                }
            }
        }
        

        System.out.println(dp[n][m]);

        // 여기에 코드를 작성해주세요.
    }
}