import java.util.*;
import java.io.*;

public class Main {
    static List<Integer> ll;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ll = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            ll.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(ll);
        func(0, "", 0);
    }

    static void func(int count, String str, int start) {
        if(count == 6) {
            System.out.println(str);
            return;
        }

        for(int i = start; i <= ll.size() - (6 - count); i++){
            func(count + 1, str + ll.get(i) + " ", i + 1);
        }

    }
}