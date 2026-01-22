import java.util.Scanner;

public class MaxofConsecutivePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 2) {
            System.out.print("-1");
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            int max = Math.max(arr[i], arr[i + 1]);
            if (i > 0) System.out.print(" ");
            System.out.print(max);
        }
    }
    
}
