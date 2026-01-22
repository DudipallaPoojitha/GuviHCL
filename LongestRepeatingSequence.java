import java.util.Scanner;
public class LongestRepeatingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(-1);
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        if (maxLength > 1) {
            System.out.println(maxLength);
        } else {
            System.out.println(-1);
        }
    }
    
}
