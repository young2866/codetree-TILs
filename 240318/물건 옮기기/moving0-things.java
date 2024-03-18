import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(hm.getOrDefault(a,2) != 2) {
                count += hm.get(a) == b ? 0 : 1;
            }
            if(hm.getOrDefault(a, 2) == 2) {
                hm.put(a , b);
            }
        }
        System.out.println(count);
    }
}