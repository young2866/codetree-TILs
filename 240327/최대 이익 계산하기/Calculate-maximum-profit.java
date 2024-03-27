import java.util.*;
import java.io.*;

public class Main {
    static int[][] dp;
    static int[] arr;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        for(int i = 0 ; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp = new int[n][n];
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                int k = i + j - 1;
                int mul = n - (k - j);
                if(i == 1) {
                    dp[j][k] = arr[j] * mul;
                }else {
                    dp[j][k] = Math.max(arr[j] * mul + dp[j+1][k], arr[k] * mul + dp[j][k-1]);
                }
            }   
        }

        System.out.println(dp[0][n-1]);

    }
}