import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse=new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
