import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> ll = new ArrayList<>();
        ll.add(new int[]{1, 0});
        ll.add(new int[]{0, 1});

        for(int i = 2; i <= N; i++) {
            int[] a = ll.get(i -1);
            int[] b = ll.get(i -2);
            ll.add(new int[]{a[0] + b[0], a[1] + b[1]});
        }

        int[] result = ll.get(N);
        System.out.println(result[0] + " " + result[1]);

        // 여기에 코드를 작성해주세요.
    }
}