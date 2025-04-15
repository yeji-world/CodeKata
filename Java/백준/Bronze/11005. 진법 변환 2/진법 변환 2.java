import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append((char) (remainder + '0'));
            } else {
                sb.append((char) (remainder - 10 + 'A'));
            }
            N /= B;
        }

        System.out.println(sb.reverse());
    }
}
