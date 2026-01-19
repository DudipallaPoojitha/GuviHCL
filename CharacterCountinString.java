import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CharacterCountinString {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        String s = st.nextToken();
        char k = st.nextToken().charAt(0);

        int count = 0;

        // Count occurrences
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k) {
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
