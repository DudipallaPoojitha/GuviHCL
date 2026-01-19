import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x > smallest && x < secondSmallest) {
                secondSmallest = x;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondSmallest);
        }
    }
    
}
