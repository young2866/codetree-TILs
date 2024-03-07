import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int dx = 1;
        int curr = A;
        int distance = 0;

        while(true) {
            int next = A + dx;
            if(dx > 0) {
                if(B <= next && curr < B) {
                    distance += (B - curr);
                    break;
                }
                distance += (next - curr);
            } else {
                if(B >= next && curr > B) {
                    distance += (curr - B);
                    break;
                }
                distance += (curr - next);
            }
            dx *= -2;
            curr = next;
        }
        System.out.println(distance);
        // 여기에 코드를 작성해주세요.
    }
}