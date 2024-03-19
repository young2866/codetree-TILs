import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        List<Integer> ll = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            ll.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(ll);

        int count = 0;
        int curr = 0;
        for(int i : ll) {
            if(curr < i + 1) {
                curr = i + l;
                count++;
            }
        }
        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
}