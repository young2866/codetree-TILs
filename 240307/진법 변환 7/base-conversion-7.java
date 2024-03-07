import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] split = str.split("\\.");
        split[1] = "0." + split[1];

        String ans = "";

        int num = Integer.parseInt(split[0]);
        while(num > 1) {
            int add = num % 2;
            num /= 2;
            ans = add+ans;
        }
        ans = num + ans + ".";

        float f = Float.parseFloat(split[1]);
        for(int i = 0; i < 4; i++) {
            f *= 2;
            if(f > 1) {
                ans+=1;
                f -= 1;
            } else {
                ans += 0;
            }
        }

        System.out.println(ans);
        // 여기에 코드를 작성해주세요.
    }
}