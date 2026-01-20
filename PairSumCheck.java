import java.util.HashSet;
import java.util.Scanner;

public class PairSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (set.contains(X - num)) {
                System.out.print("yes");
                return;
            }
            set.add(num);
        }

        // No such pair found
        System.out.print("no");
    }
    
}
