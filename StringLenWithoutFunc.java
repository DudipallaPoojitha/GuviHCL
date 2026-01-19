import java.util.Scanner;

public class StringLenWithoutFunc {
    public static int findLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String testString =sc.nextLine();
        int len = findLength(testString);
        System.out.println(len);
    }
    
}
