import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> ll = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int box = Integer.parseInt(st.nextToken());

        for(int i = 0; i < box; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            ll.add(a * b);
        }

        Collections.sort(ll, Collections.reverseOrder());
        int ans = 0;

        for(int i = 0; i < ll.size(); i++) {
            if(num - ll.get(i) <= 0) {
                ans++;
                break;
            }
        }

        System.out.println(ans);
        // 여기에 코드를 작성해주세요.
    }
}