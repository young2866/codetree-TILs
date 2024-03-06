import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int MIN = 1001;

        while(st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            MIN = Math.min(temp, MIN);
        }

        System.out.println(MIN);

    }
}