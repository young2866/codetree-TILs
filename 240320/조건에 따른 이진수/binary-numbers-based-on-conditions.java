import java.util.*;
import java.io.*;

public class Main {
    static int count = 0;
    static int n;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        Long[] arr= new Long[n+1];
        arr[1] = 1L;
        arr[2] = 1L;
        for(int i = 3; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);
        // 여기에 코드를 작성해주세요.
    }

}