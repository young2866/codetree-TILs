import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int[] arr = new int[27];

        for(int i = 0; i < str.length(); i += 2) {
            if(str.charAt(i) < 97 || str.charAt(i) > 122) {
                break;
            }
            int temp = str.charAt(i) - 97;
            arr[temp]++;
        }
        for(int i = 0; i < 27; i++) {
            if(arr[i] != 0) {
                System.out.println((char)(i+97) + " : " + arr[i]);
            }
        }

    }
}