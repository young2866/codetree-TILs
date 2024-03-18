import java.util.*;
import java.io.*;

public class Main {
    static List<int[]> visited;
    static int N;
    static int M;
    static int[] items;
    static String result;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new ArrayList<>();
        items = new int[N];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            visited.add(new int[]{a,b});
            visited.add(new int[]{b,a});
        }
        func(1);
        System.out.println(result);
        // 여기에 코드를 작성해주세요.
    }
    static void func(int area) {
        if (result != null) {
            return; // 이미 결과를 찾은 경우 종료
        }
        if(N + 1 == area) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < items.length; i++) {
                sb.append(items[i]);
            }
            result = sb.toString();
            return;
        }
        for(int i = 1; i <= 4; i++) {
            if(valid(area, i)) {
                items[area - 1] = i;
                func(area + 1);
            }
        }

    }

    static boolean valid(int area, int item) {
        for(int[] i : visited) {
            if(area == i[0] && items[i[1] - 1] == item) {
                return false;
            }
        }
        return true;
    }
}