import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        dp[0][0] = map[0][0]; 

        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0) dp[i][j] = dp[i-1][0] + map[i][j];
                else if(j==i) dp[i][j] = dp[i-1][i-1] + map[i][j];
                else dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + map[i][j];
            }
        }

        for(int i = 0; i < n; i++) {
            max = Math.max(dp[n-1][i], max);
        }

        System.out.println(max);
        // 여기에 코드를 작성해주세요.
    }
}