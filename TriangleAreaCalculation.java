import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TriangleAreaCalculation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        double B = Double.parseDouble(parts[0]);
        double H = Double.parseDouble(parts[1]);
        double area = (B * H) / 2;
        if (area == (long) area) {
            System.out.print((long) area);
        } else {
            System.out.print(area);
        }
    }
    
}
