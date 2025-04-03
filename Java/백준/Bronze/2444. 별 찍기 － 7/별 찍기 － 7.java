import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = (i <= N) ? (2 * i - 1) : (2 * (2 * N - i) - 1);
            int spaces = (i <= N) ? (N - i) : (i - N);

            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
    }
}