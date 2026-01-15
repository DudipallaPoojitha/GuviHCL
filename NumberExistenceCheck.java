import java.util.Scanner;

public class NumberExistenceCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(k==num){
                found=true;
            }
        }
        if(found){
        System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
    
}
