import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> ll = new ArrayList<>();

        int min_ans = 0;
        int max_ans = 0;

        ll.add(Integer.parseInt(st.nextToken()));
        ll.add(Integer.parseInt(st.nextToken()));
        ll.add(Integer.parseInt(st.nextToken()));

        Collections.sort(ll);

        int first = ll.get(0);
        int mid = ll.get(1);
        int last = ll.get(2);

        if(first + 1 == mid && mid + 1 == last) {
            System.out.println("0");
            System.out.println("0");
            return;
        }

        if(mid - first == 2 || last - mid == 2) {
            min_ans = 1;
        } else {
            min_ans = 2;
        }

        if(mid - first > last - mid) {
            max_ans = mid - first - 1;
        }
        else {
            max_ans = last - mid -1;
        }

        System.out.println(min_ans);
        System.out.println(max_ans);
    }
}