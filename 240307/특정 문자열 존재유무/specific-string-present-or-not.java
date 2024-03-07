import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        for(int i = 0; i < n; i++) {
            String temp = br.readLine();
            if(temp.contains(str)) {
                System.out.println(temp);
            }
        }
        // 여기에 코드를 작성해주세요.
    }
}