import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int max = 0;
    static List<int[]> ll;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        ll = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ll.add(new int[]{a,b});
        }

        func(0, 0, t);

        System.out.println(max);

        // 여기에 코드를 작성해주세요.
    }
    static void func(int start, int sum, int now) {
        if(start == n || now == 0) {
            max = Math.max(sum, max);
            return;
        }

        int[] temp = ll.get(start);
        if(now - temp[0] >= 0) {
            func(start + 1, sum + temp[1], now-temp[0]);
        }
        func(start + 1, sum, now);
    }
}