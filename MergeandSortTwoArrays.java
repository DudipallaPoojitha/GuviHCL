import java.util.Arrays;
import java.util.Scanner;

public class MergeandSortTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[M];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < N && j < M) {
            if (a[i] <= b[j]) {
                sb.append(a[i++]).append(" ");
            } else {
                sb.append(b[j++]).append(" ");
            }
        }

        while (i < N) {
            sb.append(a[i++]).append(" ");
        }

        while (j < M) {
            sb.append(b[j++]).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
    
}
