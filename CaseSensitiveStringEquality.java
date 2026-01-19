import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CaseSensitiveStringEquality {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // If lengths are different, strings are not equal
        if (s1.length() != s2.length()) {
            System.out.print("no");
            return;
        }

        // Compare each character manually (case-sensitive)
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.print("no");
                return;
            }
        }

        // If all characters match
        System.out.print("yes");
    }
    
}
