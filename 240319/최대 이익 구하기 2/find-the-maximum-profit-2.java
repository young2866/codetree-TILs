import java.util.*;
import java.io.*;

public class Main {
    static List<int[]> ll;
    static int count = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ll = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ll.add(new int[]{a, b});
        }
        func(0, 0);
        
        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
    static void func(int now, int sum) {
        if(now >= ll.size()) {
            count = Math.max(sum, count);
            return;
        }
        func(now+1, sum);
        int[] a = ll.get(now);
        if(now + a[0] <= ll.size()) {
            func(now + a[0], sum + a[1]);
        }
    }
}