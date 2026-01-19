import java.util.Scanner;

public class NearestGreaterMultipleof10 {public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n=N%10;
        N=N+(10-n);   
        System.out.println(N);
    }
}
