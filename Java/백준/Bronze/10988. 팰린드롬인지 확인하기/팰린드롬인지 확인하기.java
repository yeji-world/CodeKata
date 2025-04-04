import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        sc.close();

        int length = word.length();
        boolean isPalindromes = true;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length-1-i)) {
                isPalindromes = false;
                break;
            }
        }

        System.out.println(isPalindromes ? 1 : 0);
    }
}