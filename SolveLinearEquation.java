import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolveLinearEquation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int x = Integer.parseInt(parts[2]);

        int y = a * x + b;

        System.out.print(y);
    }
    
}
