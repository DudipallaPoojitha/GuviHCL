import java.util.Scanner;

public class MaxLengthIncreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N <= 1) {
            System.out.println(-1);
            return;
        }

        int prev = sc.nextInt();
        int currLen = 1;
        int maxLen = 1;

        for (int i = 1; i < N; i++) {
            int curr = sc.nextInt();
            if (curr > prev) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
            prev = curr;
        }

        System.out.println(maxLen > 1 ? maxLen : -1);
    }
    
}
