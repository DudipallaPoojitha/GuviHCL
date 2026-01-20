public class CommonCharactersinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        HashSet<Character> set = new HashSet<>();

        // Store characters of first string
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        // Check for common character
        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) {
                System.out.print("yes");
                return;
            }
        }

        // No common character
        System.out.print("no");
    }
    
}
