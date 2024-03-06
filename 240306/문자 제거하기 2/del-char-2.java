import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder a = new StringBuilder(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            int d = Integer.parseInt(br.readLine());
            if(a.length() >= d) { 
                a.deleteCharAt(d - 1);
                System.out.println(a);
            }
        }
    }
}