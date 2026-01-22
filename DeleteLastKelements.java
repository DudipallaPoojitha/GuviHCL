import java.util.Scanner;

public class DeleteLastKelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N and K
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // If K removes all or more elements
        if (K >= N) {
            System.out.print("-1");
            return;
        }

        // Print array after deleting last K elements
        for (int i = 0; i < N - K; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
    
}
