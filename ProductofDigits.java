import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int product=1;
        if(N==0){
            product=0;
        }
        else{
        while(N>0){
            product=product*(N%10);
            N/=10;
        }
        }
        System.out.println(product);
    }
    
}
