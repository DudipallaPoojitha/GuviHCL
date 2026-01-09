import java.util.*;
import java.util.Scanner;
public class OddorEven{
    public static void main (String[] agrs){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int sum=M+N;
        if(sum%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}