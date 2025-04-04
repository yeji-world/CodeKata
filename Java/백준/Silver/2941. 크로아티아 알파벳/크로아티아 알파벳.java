import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        sc.close();

        String[] crotiaAlphbet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String str : crotiaAlphbet) {
            word = word.replace(str, "0");
        }

        System.out.println(word.length());
        }
    }