import java.util.Scanner;

public class ModuloMultiplication {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int d=a*b;
       int e=d%c;
       System.out.println(e);
    }
    
}
