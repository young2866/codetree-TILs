import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String target = br.readLine();

        int now = 0;
        int count = 1;
        int index = 0;
        boolean check = true;

        while(check) {
            if(str.charAt(index) ==  target.charAt(now)) {
                now++;
            }
            if(target.length() != now) {
                index++;
                if(index == str.length()) {
                    count++;
                    index = 0;
                }
            }
            if(target.length() == now) {
                break;
            }
        }

        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
}