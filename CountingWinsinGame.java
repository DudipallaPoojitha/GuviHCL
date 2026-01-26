import java.util.Scanner;

public class CountingWinsinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int ramCount = 0;
        int sitaCount = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int value = sc.nextInt();
                if (value == 0) {
                    ramCount++;
                } else if (value == 1) {
                    sitaCount++;
                }
            }
        }

        System.out.println("RAM: " + ramCount);
        System.out.println("SITA: " + sitaCount);

        sc.close();
    }
    
}
