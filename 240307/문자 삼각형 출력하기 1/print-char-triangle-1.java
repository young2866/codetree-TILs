import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char start = 'A';
        char end = 'Z';

        for(int i = 0; i < n; i++) {
            int temp = (2*n - 2) - i * 2;
            for(int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            int ii = i + 65;
            if(ii > 90)
                ii = (i - 65) % 26 + 65;
            System.out.print((char) ii + " ");
            for(int j = 1; j <= i; j++) {
                ii += (n - j);
                if(ii > 90)
                    ii = (i - 65) % 26 + 65;

                System.out.print((char)ii + " " );
            }
            System.out.println();
        }


        // 여기에 코드를 작성해주세요.
    }
}