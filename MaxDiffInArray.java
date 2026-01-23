import java.util.Scanner;

public class MaxDiffInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 2) {
            System.out.println(-1);
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println(max - min);
    }
    
}
