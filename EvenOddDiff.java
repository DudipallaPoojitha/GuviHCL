import java.util.Scanner;

public class EvenOddDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int P=M-N;
        if(P%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
