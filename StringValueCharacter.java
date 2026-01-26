import java.util.Scanner;

public class StringValueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine().toLowerCase();
            int sum = 0;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                int position = ch - 'a' + 1;

                if (position % 2 == 0) {
                    sum -= position;
                } else {
                    sum += position;
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
    
}
