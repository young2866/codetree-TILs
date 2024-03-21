import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
       
        System.out.println((x + y) -  gcd(x, y));
        

        
        // 여기에 코드를 작성해주세요.
    }
    static int gcd(int x, int y) {
        while(x != 0) {
            int temp = x;
            x = y % x;
            y = temp;
        }
        return y;
    }
}