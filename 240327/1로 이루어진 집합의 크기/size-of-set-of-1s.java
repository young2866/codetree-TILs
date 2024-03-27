import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static int max = 0;
    static int n;
    static int m;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1;
                    func(i, j);
                    map[i][j] = 0;
                }
            }
        }

        System.out.println(max);
        // 여기에 코드를 작성해주세요.
    }

    static void func(int x, int y) {
        int[][] visited = new int[n][m];
        int count = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            int[] temp = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m )
                    continue;
                if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
                    q.add(new int[]{nx, ny});
                    count++;
                    visited[nx][ny] = 1;
                }
            }

        }
        max = Math.max(max, count);
    }
}