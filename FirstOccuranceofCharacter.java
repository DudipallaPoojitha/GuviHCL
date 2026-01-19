import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstOccuranceofCharacter {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read input line
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        String s = st.nextToken();
        char k = st.nextToken().charAt(0);

        // Traverse string to find first occurrence
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k) {
                System.out.print(i + 1); // 1-based index
                return;
            }
        }

        // If character not found
        System.out.print(-1);
    }
    
}
