import java.util.Scanner;

public class FarmAreaCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        float area=l*b;
        System.out.printf("%.5f%n",area);
    }
    
}
