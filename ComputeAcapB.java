
import java.io.*;
import java.math.BigInteger;
public class ComputeAcapB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        BigInteger result = BigInteger.valueOf(A).pow(B);

        System.out.print(result);
    }
    
}
