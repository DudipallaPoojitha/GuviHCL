import java.util.HashSet;
import java.util.Scanner;

public class RemoveCharactersinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();

        HashSet<Character> set = new HashSet<>();
        for (char c : S2.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (char c : S1.toCharArray()) {
            if (!set.contains(c)) {
                result.append(c);
            }
        }

        if (result.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(result.toString());
        }
    }
    
}
