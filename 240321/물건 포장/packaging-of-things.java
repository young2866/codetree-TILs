import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j = i; j > 0 && i-j < m; j--) {
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                dp[i] = Math.min(dp[i],dp[j-1] + k + (i - j + 1) *(max - min));
            }
        }

        System.out.println(dp[n]);
    }
}