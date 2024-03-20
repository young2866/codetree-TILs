import java.util.*;
import java.io.*;


public class Main {
    static int max = 0;
    static int N;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[] energy = new int[N];
        int[] happy = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            energy[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            happy[i] = Integer.parseInt(st.nextToken());
        }
        func(energy, happy, 100, 0, 0);
        System.out.println(max);
        // 여기에 코드를 작성해주세요.
    }

    static void func(int[] energy, int[] happy, int now, int sum, int index) {
        if(index == N) {
            max = Math.max(sum, max);
            return;
        }

        if(now - energy[index] > 0) {
            func(energy, happy, now - energy[index], sum + happy[index], index+1);
        }
        func(energy, happy, now, sum, index+1);

    }
}