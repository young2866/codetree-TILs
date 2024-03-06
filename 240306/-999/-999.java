import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX = -1000;
        int MIN = 1000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());

            if(temp == -999) {
                break;
            }

            MAX = Math.max(temp, MAX);
            MIN = Math.min(temp, MIN);
        }

        System.out.println(MAX + " " + MIN);
    }
}