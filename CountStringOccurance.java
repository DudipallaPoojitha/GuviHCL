import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountStringOccurance {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read sentence and pattern string
        String sentence = br.readLine();
        String s = br.readLine();

        int count = 0;
        int n = sentence.length();
        int m = s.length();

        // Edge case
        if (m > n) {
            System.out.print(-1);
            return;
        }

        // Manual substring matching (O(n))
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && sentence.charAt(i + j) == s.charAt(j)) {
                j++;
            }
            if (j == m) {
                count++;
            }
        }

        // Output result
        if (count == 0) {
            System.out.print(-1);
        } else {
            System.out.print(count);
        }
    }
    
}
