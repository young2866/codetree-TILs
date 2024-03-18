import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        Long[] longArray = Arrays.stream(split)
                                  .mapToLong(Long::parseLong)
                                  .boxed()
                                  .toArray(Long[]::new);
        Arrays.sort(longArray);
        if(split.length % 2 == 0) {
            Long max = 0L;
            for(int i = 0; i <= split.length / 2; i++) {
                max = Math.max(longArray[i] + longArray[split.length - i - 1], max);
            }
        }else {
            Long max = 0L;
            for(int i = 0; i <= split.length / 2 - 1; i++) {
                max = Math.max(longArray[i] + longArray[split.length - i - 2], max);
            }
            max = Math.max(max, longArray[split.length - 1]);
            System.out.println(max);
        }

        // 여기에 코드를 작성해주세요.
    }
}