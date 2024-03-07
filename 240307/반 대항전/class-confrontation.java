import java.util.*;
import java.io.*;

public class Main {
    static char[] classes = { 'A', 'B', 'C', 'D'};
    static int MAX = -1;
    static int WINNER = 5;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < 4; i++) {
            String[] split = br.readLine().split(" ");
            int sum = 0;

            for(int j = 1; j <= n; j++) {
                sum += Integer.parseInt(split[j]);
            }
            if( sum > MAX) {
                WINNER = i;
                MAX = sum;
            }
            System.out.println(classes[i] + " - " + sum);
        }
        System.out.println("Class " +classes[WINNER] + " is winner!");
        // 여기에 코드를 작성해주세요.
    }
}