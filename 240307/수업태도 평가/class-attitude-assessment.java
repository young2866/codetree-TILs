import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Bessie", 0);
        hm.put("Elsie", 0);
        hm.put("Daisy", 0);
        hm.put("Gertie", 0);
        hm.put("Annabelle", 0);
        hm.put("Maggie", 0);
        hm.put("Henrietta", 0);

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String temp = st.nextToken();
            int grade = Integer.parseInt(st.nextToken());

            hm.put(temp, hm.getOrDefault(temp, 0) + grade );
        }
        List<String> keySet = new ArrayList<>(hm.keySet());

        keySet.sort((o1, o2) -> hm.get(o1).compareTo(hm.get(o2)));

        int first = hm.get(keySet.get(0));
        int second = -1;
        String ans = "Tie";
        for(int i = 1; i < keySet.size(); i++) {
            if(hm.get(keySet.get(i)) != first && second == -1) {
                second = hm.get(keySet.get(i));
                ans = keySet.get(i);
            }else if(hm.get(keySet.get(i))==second) {
                ans = "Tie";
                break;
            }
        }

        System.out.println(ans);

        // 여기에 코드를 작성해주세요.
    }
}