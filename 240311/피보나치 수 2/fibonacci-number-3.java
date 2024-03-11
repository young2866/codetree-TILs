import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long first = 0;
        long second = 1;

        int n = Integer.parseInt(br.readLine());

        for(int i = 2; i <= n; i++) {
            long temp = (first + second) % 1000000007;
            first = second;
            second = temp;
        }
        System.out.println(second);

        // 여기에 코드를 작성해주세요.
    }
}