import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class NumberRepeatedKtimes {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().trim().split("\\s+");
        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);

        String[] arr = br.readLine().trim().split("\\s+");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arr[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == K) {
                result.add(key);
            }
        }

        if (result.size() == 0) {
            System.out.print("-1");
            return;
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size() - 1) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());
    }

    
}
