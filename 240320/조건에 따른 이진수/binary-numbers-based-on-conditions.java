import java.util.*;
import java.io.*;

public class Main {
    static int count = 0;
    static int n;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[] arr= new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);
        // 여기에 코드를 작성해주세요.
    }
    static void func(String target) {
    }

}