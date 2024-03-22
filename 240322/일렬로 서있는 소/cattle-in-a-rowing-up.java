import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        Long count = 0L;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int x = j + 1; x < N; x++) {
                    if(arr[j]- arr[i] <= arr[x] - arr[j] &&
                     (arr[j]-arr[i]) * 2 >= arr[x]-arr[j])
                     count++;
                }
            }
        }


        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
}