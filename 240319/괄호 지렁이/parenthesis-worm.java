import java.util.*;
import java.io.*;

public class Main {
    static int max = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        int[][] visited = new int[N][N];

        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        if(arr[0].charAt(0)==')') {
            System.out.println(max);
            return;
        }

        visited[0][0] = 1;
        func(arr, visited, 0, 0, 1, false, 1);

        System.out.println(max);
        
        // 여기에 코드를 작성해주세요.
    }
    static void func(String[] arr, int[][] visited,
                         int x, int y, int count, boolean flag, int result) {
        if(flag && count == 0) {
            max = Math.max(result, max);
            return;
        }

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny] == 1)
                continue;
            if(!flag && arr[nx].charAt(ny) == '(') {
                visited[nx][ny] = 1;
                func(arr, visited, nx, ny, count+1, false, result + 1);
                visited[nx][ny] = 0;
            }
            if(!flag && arr[nx].charAt(ny) == ')') {
                visited[nx][ny] = 1;
                func(arr, visited, nx, ny, count-1, true, result + 1);
                visited[nx][ny] = 0;
            }
            if(flag && arr[nx].charAt(ny) == ')') {
                visited[nx][ny] = 1;
                func(arr, visited, nx, ny, count-1, true, result + 1);
                visited[nx][ny] = 0;
            }
        }
    }
}