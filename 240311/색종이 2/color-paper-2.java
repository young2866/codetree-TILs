import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int[][] map = new int[512][512];
        int ans = 0;

        int n = Integer.parseInt(br.readLine());

        for(int i =0 ; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x + 1; j <= x + 10; j++) {
                for(int k = y+1; k <= y + 10; k++) {
                    map[j][k]++;
                }
            }
        }

        for(int i = 1; i <= 511; i++) {
            for(int j = 1; j <= 511; j++) {
                if(map[i][j] != 0) {
                    for(int k = 0; k < 4; k++) {
                        if(map[i + dx[k]][j + dy[k]] == 0) {
                            ans++;
                        } 
                    }
                }
            }
        }

        System.out.println(ans);
    }
}