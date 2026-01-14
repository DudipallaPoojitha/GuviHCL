import java.util.Scanner;

public class GCDof2Nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            if(!sc.hasNextInt()){
                System.out.println(-1);
                return;
            }
            int n=sc.nextInt();
            if(!sc.hasNextInt()){
                System.out.println(-1);
                return;
            }
            int m=sc.nextInt();
            if(n==0 || m==0){
                System.out.println(-1);
                return;
            }
            System.out.println(gcd(n,m));
            
        }catch(Exception e){
            System.out.println(-1);
        }
        sc.close();
    }
    public static int gcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
           return a;
        
    }
    
}
