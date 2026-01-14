import java.util.Scanner;

public class ReverseofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long reversed=0;
        while(n!=0){
            long digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        System.out.println(reversed);
    }
    
}
