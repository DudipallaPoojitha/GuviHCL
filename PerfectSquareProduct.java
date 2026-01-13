import java.util.Scanner;

public class PerfectSquareProduct {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=n*m;
        long sqrt=(long)Math.sqrt(a);
        
        if(sqrt*sqrt==a){
            System.out.println("yes");
            
        }
        else{
            System.out.println("no");
            
        }
    }
    
}
