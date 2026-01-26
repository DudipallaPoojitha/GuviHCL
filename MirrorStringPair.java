import java.util.HashSet;
import java.util.Scanner;

public class MirrorStringPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < N; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            String reverse = s2 + "#" + s1;
            if (set.contains(reverse)) {
                found = true;
                break;
            }

            set.add(s1 + "#" + s2);
        }

        System.out.println(found ? "YES" : "NO");
        sc.close();
    }
    
}
