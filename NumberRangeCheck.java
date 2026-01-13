import java.util.Scanner;

public class NumberRangeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(a>x && a<y){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
