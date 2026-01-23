import java.util.Scanner;

public class FindDiffNumberinSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if ((arr[i] & 1) == 0)
                evenCount++;
            else
                oddCount++;
        }

        // Not enough elements to determine a pattern
        if (N < 3) {
            System.out.println(-1);
            return;
        }

        // Majority odd → find even outlier
        if (oddCount == N - 1 && evenCount == 1) {
            for (int x : arr) {
                if ((x & 1) == 0) {
                    System.out.println(x);
                    return;
                }
            }
        }
        // Majority even → find odd outlier
        else if (evenCount == N - 1 && oddCount == 1) {
            for (int x : arr) {
                if ((x & 1) == 1) {
                    System.out.println(x);
                    return;
                }
            }
        }

        // No valid different number
        System.out.println(-1);
    }
    
}
