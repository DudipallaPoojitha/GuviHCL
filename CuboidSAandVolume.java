import java.util.Scanner;

public class CuboidSAandVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int tsa=2*((l*b)+(b*h)+(h*l));
        int vol=l*b*h;
        System.out.print(tsa+" ");
        System.out.print(vol);
        
    }
    
}
