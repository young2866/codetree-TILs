import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static int max = 0;
    static int n;
    static int m;
    static int index = 2;
    static HashMap<Integer, Integer> hm= new HashMap<>();
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] visited;
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
        visited = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 1)
                    func(i, j);
            }
        }
        if(hm.size() == 0) {
            System.out.println("0");
            return;
        }
        if(hm.size() == 1 && hm.get(2) == n * m) {
            System.out.println(n*m -1);
            return;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 0) {
                    int count = 0;
                    List<Integer> temp = new ArrayList<>();
                    for(int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx < 0 || nx >= n || ny <0 || ny >= m || map[nx][ny] == 0)
                            continue;
                        else {
                            if(!temp.contains(map[nx][ny])) {
                                temp.add(map[nx][ny]);
                            }
                        }
                    }
                    for(int k : temp) {
                        count+=hm.get(k);
                    }
                    max = Math.max(count + 1, max);
                }
            }
        }
        

        System.out.println(max);
        // 여기에 코드를 작성해주세요.
    }

    static void func(int x, int y) {
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        map[x][y] = index;
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            int[] temp = q.poll();
            count++;
            for(int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m )
                    continue;
                if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
                    q.add(new int[]{nx, ny});
                    map[nx][ny] = index;
                    visited[nx][ny] = 1;
                }
            }
        }
        hm.put(index++, count); 
    }
}