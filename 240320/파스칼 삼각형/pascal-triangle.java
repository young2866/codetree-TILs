import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] map = new int[30][30];
        for(int i = 0; i < 30; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    map[i][j] = 1;
                    continue;
                } else {
                    map[i][j] = map[i-1][j-1]+map[i-1][j];
                }
            }
        }

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int sum = 0;
        for(int i =  r - 1; i < r + (w-1); i++) {
            for(int j = 0; j <= i - (r-1); j++) {
                sum += map[i][c - 1+j];
            }
        }

        System.out.println(sum);
        // 여기에 코드를 작성해주세요.
    }
}