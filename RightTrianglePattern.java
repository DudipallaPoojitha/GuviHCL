import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int count = 2 * i - 1;
            for (int j = 1; j <= count; j++) {
                System.out.print("1");
                if (j < count) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
