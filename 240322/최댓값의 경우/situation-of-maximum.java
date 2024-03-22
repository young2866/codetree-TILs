import java.util.*;
import java.io.*;

public class Main {
    static List<int[]> ll;
    static int min = 0;
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ll = new ArrayList<>();
        boolean[] chk = new boolean[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ll.add(new int[]{a,b});
        }
        func(chk, d, 100001,0);
        System.out.println(min);
        // 여기에 코드를 작성해주세요.
    }

    static void func(boolean[] chk, int target, int now, int index) {
        if(target == 0) {
            min = Math.max(now, min);
        }

        for(int i = index; i < chk.length; i++) {
            if(chk[i] == false) {
                int[] temp = ll.get(i);
                if(target - temp[0] >= 0) {
                    chk[i] = true;
                    int min_temp = Math.min(now, temp[1]);
                    func(chk, target-temp[0], min_temp, i+1);
                    chk[i] = false;
                }
            }
        }
    }
}