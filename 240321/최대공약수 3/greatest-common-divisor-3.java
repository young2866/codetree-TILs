import java.util.*;
import java.io.*;

public class Main { public static void main(String[] args) throws IOException{


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

    long ans = 1L;
    for(int i = 0; i < n; i++) {
        int temp = arr[i];
        for(int j = 0; j < m; j++) {
            int gcd = gcd(temp, arr2[j]);
            ans = (ans * gcd) % 1000000007;
            temp /= gcd;
            arr2[j] /= gcd;
        }
    }

    System.out.println(ans);


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