import java.util.Arrays;
import java.util.Scanner;

public class MinDiffInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(-1);
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            int diff = arr[i] - arr[i - 1]; // already absolute after sort
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(minDiff);
    }
    
}
