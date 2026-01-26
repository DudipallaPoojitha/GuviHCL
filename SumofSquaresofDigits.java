public class SumofSquaresofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        while (N > 0) {
            int digit = N % 10;
            sum += digit * digit;
            N /= 10;
        }

        System.out.println(sum);
        sc.close();
    }
    
}
