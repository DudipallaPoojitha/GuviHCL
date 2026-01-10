import java.util.*;

public class NextGreaterPowerof2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=1;
       while(count<=n){
           count=count*2;
    }
    System.out.println(count);
}
    
}
