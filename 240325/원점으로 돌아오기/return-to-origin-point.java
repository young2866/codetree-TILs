import java.util.*;
import java.io.*;

public class Main {
    static List<int[]> ll;
    static int N;
    static int count = 0;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ll = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            ll.add(new int[] {a, b});
        }
        int[] visited = new int[N];

        func(0, visited, new int[]{0, 0}, 0,0);
        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }

    static void func (int now, int[] visited, int[] curr, int prex, int prey) {
        if(now == N && (curr[0] == 0 || curr[1] == 0)) {
            count++;
            return;
        }
        for(int i = 0; i < N; i++) {
            if(visited[i] == 0) {
                int[] temp = ll.get(i);
                
                if(temp[0] == curr[0] || temp[1] == curr[1]) {
                    if(temp[0] - curr[0] != 0) {
                        int dx = temp[0] - curr[0] / Math.abs(temp[0] - curr[0]);
                        if(dx == prex) {
                            continue;
                        }
                        visited[i] = 1;
                        func(now + 1, visited, temp, dx, 0);
                        visited[i] = 0;
                    }
                    if(temp[1] - curr[1] != 0) {
                        int dy = temp[1] - curr[1] / Math.abs(temp[1] - curr[1]);
                        if(dy == prey) {
                            continue;
                        }
                        visited[i] = 1;
                        func(now + 1, visited, temp, 0, dy);
                        visited[i] = 0;
                    }
                }
            }
        }
    }
}