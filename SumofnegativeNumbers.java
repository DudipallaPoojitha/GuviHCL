import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumofnegativeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split("\\s+");
        long sum = 0; // use long to be extra safe
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(parts[i]);
            if (val < 0) {
                sum += val;
            }
        }

        System.out.print(sum);
    }
    
}
