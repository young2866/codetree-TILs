import java.util.*;
import java.io.*;
import java.math.*;

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
        for(int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        BigInteger a = BigInteger.valueOf(arr[0]);
        BigInteger b = BigInteger.valueOf(arr2[0]);
        for (int i = 1; i < n; i++) {
            a = a.multiply(BigInteger.valueOf(arr[i]));
        }
        for (int i = 1; i < m; i++) {
            b = b.multiply(BigInteger.valueOf(arr2[i]));
        }

        BigInteger gcd = a.gcd(b);
        System.out.println(gcd.mod(BigInteger.valueOf(1000000007)));


        // 여기에 코드를 작성해주세요.
    }

    static int gcd(int a, int b) {
    while(b != 0) { // 수정: b가 0이 될 때까지 반복
        int temp = a;
        a = b;
        b = temp % b; // 수정: a와 b의 나머지 연산
    }
        return a; // 수정: 최대공약수 반환
    }
}