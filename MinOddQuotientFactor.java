import java.util.Scanner;

public class MinOddQuotientFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int factor = 1;

        // Remove all factors of 2
        while (N % 2 == 0) {
            N /= 2;
            factor *= 2;
        }

        System.out.print(factor);
    }
    
}
