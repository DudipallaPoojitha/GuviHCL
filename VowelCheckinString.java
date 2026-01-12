import java.util.Scanner;

public class VowelCheckinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        if(s.matches(".*[aeiou].*")){
            System.out.println("yes");
            
        }
        else{
            System.out.println("no");
        }
    }
    
}
