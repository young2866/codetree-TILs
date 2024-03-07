import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] newArr = new int[n+1][n+1];

        for(int i = 0; i < n; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            while(j < n) {
                newArr[i][j] = Integer.parseInt(st.nextToken());
                sum+= newArr[i][j];
                j++;
            }
            newArr[i][j] = sum;
        }

        for(int i = 0; i <= n; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += newArr[j][i];
            }
            newArr[n][i] = sum;
        }

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
        // 여기에 코드를 작성해주세요.
    }
}