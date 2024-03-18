import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String target = br.readLine();

        int a_count = 0;
        int b_count = 0;
        for(int i = 0; i < target.length(); i++) {
            if(target.charAt(i) == 'a')
                a_count++;
            else
                b_count++;
        }
        int result = 1;
        char count = a_count >= b_count ? 'b' : 'a';
        boolean chk = false;

        for(int i = 0; i < target.length(); i+=2) {
            if(chk && target.charAt(i) != count) {
                chk = false;
            }
            if(!chk && target.charAt(i) == count) {
                result++;
                chk = true;
            }
        }
        System.out.println(result);
        // 여기에 코드를 작성해주세요.
    }
}