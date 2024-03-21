import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int dx = y%x == 0 ? y/x : y/x + 1;

        System.out.println(dx * x);


        
        // 여기에 코드를 작성해주세요.
    }

    
}