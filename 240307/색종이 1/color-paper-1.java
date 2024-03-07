import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int map[][] = new int[511][511];
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int f = x; f < x + 10; f++) {
                for(int s = y; s < y + 10; s++){
                    if(map[f][s] == 0) {
                        map[f][s] = 1;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
}