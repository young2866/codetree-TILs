import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;
        dp[1] = arr[1];
        for(int i = 2; i <= n; i++) {
            for(int j = 1; i-j >= 0; j++) {
                dp[i] = Math.min(dp[i-j] + arr[j], dp[i]);
            }
        }
        System.out.println(dp[n]);

        

        // 여기에 코드를 작성해주세요.
    }
}