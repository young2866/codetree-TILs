import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Long ans = 1L;
        for(int i = 0; i < n; i++) {
            int temp = arr[i];
            for(int j = 0; j < m; j++) {
                int gcd = gcd(temp, arr2[j]);
                ans = (ans * gcd) % 1000000007;
                temp /= gcd;
            }
        }

        System.out.println(ans);


        // 여기에 코드를 작성해주세요.
    }

    static int gcd(int a, int b) {
        while(a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}