import java.util.*;
import java.io.*;

public class Main {
    static int count = 0;
    static int n;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if(n == 1 || n == 2) {
            System.out.println(1);
            return;
        }
        func("10");

        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
    static void func(String target) {
        if(target.length() == n) {
            count++;
            return;
        }

        if(target.charAt(target.length() - 1 ) == '0') {
            func(target + "0");
            func(target + "1");
        } else {
            func(target + "0");
        }
    }

}