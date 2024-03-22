import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> ll = new LinkedList<>();

        for(int i = 0 ; i < n; i++) {
            ll.add(Integer.parseInt(br.readLine()));
        }

        int first = 0;
        int end = n - 1;
        int count = 1;
        int sum = 0;
        while(first <= end) {
            int first_count = ll.get(first) * count;
            int second_count = ll.get(end) * count;
            if(first_count >= second_count) {
                sum += second_count;
                end--;
                count++;
            }
            else {
                sum += first_count;
                first++;
                count++;
            }
        }
        System.out.println(sum);
        // 여기에 코드를 작성해주세요.
    }
}