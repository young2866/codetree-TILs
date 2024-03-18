import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String target = br.readLine();

        int result = 1;
        char count = target.charAt(0);
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
    }
}