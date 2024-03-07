import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        int MAX = Math.max(Integer.parseInt(split[0]),
         Math.max(Integer.parseInt(split[1]), Integer.parseInt(split[2])));

         int MIN = Math.min(Integer.parseInt(split[0]),
         Math.min(Integer.parseInt(split[1]), Integer.parseInt(split[2])));

         int MID = 0;
         for(int i = 0; i < 2; i++) {
            if(Integer.parseInt(split[i]) != MAX && Integer.parseInt(split[i]) != MIN)
                MID = Integer.parseInt(split[i]);
         }

         for(int i = MIN; i <= MAX; i++) {
            if(i != MID)
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
         }
        // 여기에 코드를 작성해주세요.
    }
}