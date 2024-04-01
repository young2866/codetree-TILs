import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static String[] map;
    static int normal = 0;
    static int answer = 0;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new String[n];

        for(int i = 0; i < n; i++) {
            map[i] = br.readLine();
        }
        normal();
        answer();

        System.out.println(normal + " " + answer);

        // 여기에 코드를 작성해주세요.
    }
    static void normal() {
        Queue<int[]> q = new LinkedList<>();
        int[][] visited = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                char curr = map[i].charAt(j);
                if(visited[i][j] != 1) {
                    normal++;
                    q.add(new int[]{i,j});
                    visited[i][j] = 1;
                    while(!q.isEmpty()) {
                        int[] temp = q.poll();
                        for(int k = 0; k < 4; k++) {
                            int nx = temp[0] + dx[k];
                            int ny = temp[1] + dy[k];
                            if(nx < 0 || nx >= n || ny < 0 || ny >= n)
                                continue;
                            if(visited[nx][ny] != 1 && curr == map[nx].charAt(ny)) {
                                q.add(new int[] {nx,ny});
                                visited[nx][ny] = 1;
                            }
                        }
                    }

                }
            }
        }
    }

    static void answer() {
        Queue<int[]> q = new LinkedList<>();
        int[][] visited = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                char curr = map[i].charAt(j);
                if(visited[i][j] != 1) {
                    answer++;
                    q.add(new int[]{i,j});
                    visited[i][j] = 1;
                    while(!q.isEmpty()) {
                        int[] temp = q.poll();
                        for(int k = 0; k < 4; k++) {
                            int nx = temp[0] + dx[k];
                            int ny = temp[1] + dy[k];
                            if(nx < 0 || nx >= n || ny < 0 || ny >= n)
                                continue;
                            if(visited[nx][ny] != 1 && (curr == 'R' || curr == 'G') && (map[nx].charAt(ny)== 'R' || map[nx].charAt(ny)== 'G')) {
                                q.add(new int[] {nx,ny});
                                visited[nx][ny] = 1;
                            } else if(visited[nx][ny] !=1 && curr == map[nx].charAt(ny)) {
                                q.add(new int[] {nx,ny});
                                visited[nx][ny] = 1;
                            }
                        }
                    }

                }
            }
        }
    }

}