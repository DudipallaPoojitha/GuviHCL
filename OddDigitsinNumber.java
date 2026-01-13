import java.util.Scanner;

public class OddDigitsinNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        StringBuilder odd=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit%2!=0){
                odd.append(digit).append(" ");
            }
        }
        if(odd.length()==0){
            System.out.println(-1);
        
        }else{
            System.out.println(odd.toString().trim());
        }
    }
    
}
