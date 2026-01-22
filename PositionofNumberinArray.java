import java.util.Scanner;
public class PositionofNumberinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while (i < N) {
            if (arr[i] == K) {
                // Print 1-based position
                System.out.print(i + 1);
                return;
            }
            i += Math.abs(arr[i] - K);
        }

        System.out.print("-1");
    }
    
}
