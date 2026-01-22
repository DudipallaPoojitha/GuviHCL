import java.util.Scanner;

public class RotatedArrayRotationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int[] arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int index = 0;

        for (int i = 1; i < M; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        // If no rotation
        if (index == 0) {
            System.out.print("-1");
        } else {
            System.out.print(index);
        }
    }
    
}
