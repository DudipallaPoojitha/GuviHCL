import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedElementsLessthanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num < K) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            System.out.print("-1");
        } else {
            Collections.sort(result);
            StringBuilder sb = new StringBuilder();
            for (int num : result) {
                sb.append(num).append(" ");
            }
            System.out.print(sb.toString().trim()); 
        }
    }
    
}
