import java.util.Scanner;

public class oddEvenStringSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S = sc.nextLine(); 
        StringBuilder evenChars = new StringBuilder(); 
        StringBuilder oddChars = new StringBuilder(); 

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (i % 2 == 0) {
                evenChars.append(currentChar);
            } else {
                oddChars.append(currentChar);
            }
        }
        System.out.print(evenChars.toString()+" "+oddChars.toString());
    }
    
}
