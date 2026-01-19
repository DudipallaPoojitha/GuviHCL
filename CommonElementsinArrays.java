import java.util.Scanner;

public class CommonElementsinArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            B[i] = sc.nextInt();
        int i = 0, j = 0;
        boolean found = false;
        StringBuilder result = new StringBuilder();
        while (i < n && j < n) {
            if (A[i] == B[j]) {
                result.append(A[i]).append(" ");
                found = true;
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        if (!found) {
            System.out.print("-1");
        } else {
            // remove last space and print
            System.out.print(result.toString().trim());
        }
        
        sc.close();
    }
    
}
