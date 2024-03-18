import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] mac = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            mac[i] = Integer.parseInt(st.nextToken());
        }
        int K = Integer.parseInt(br.readLine());
        Integer[] items = new Integer[K];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < K; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(mac);
        Arrays.sort(items);

        int time = 0;
        int index = K - 1;

        while(index >= 0) {
            int remove = 0;
            for(int m : mac) {
                if(index >= 0 && items[index] <= m) {
                    index--;
                    remove++;
                }
            }
            if(remove == 0) break;
            time++;
        }

        System.out.println(index == -1 ? time : -1);

    }
}