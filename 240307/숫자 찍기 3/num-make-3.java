import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[][] map = new int[f][f];
        map[0][0] = 1;

        for(int i = 1; i < f; i++) {
            for(int j = 0; j <= i; j++) {
                if(j - 1 >= 0) {
                    map[i][j] += map[i-1][j-1];
                }
                map[i][j] += map[i-1][j];
            }
        }
        func(map, s);
        // 여기에 코드를 작성해주세요.
    }

    static void func(int[][] map, int num) {
        if(num == 1) {
            for(int i = 0; i < map[0].length; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        } else if( num == 2 ) {
            for(int i = map[0].length - 1; i >= 0; i--) {
                for(int x = 0; x < map[0].length - 1 - i; x++) {
                    System.out.print(" ");
                }
                for(int j = 0; j <= i; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for(int i = 0; i < map[0].length; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print(map[map[0].length - 1 - j][i - j] + " ");
                }
                System.out.println();
            }
        }
    }

}