import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        sc.close();

        word = word.toUpperCase();
        Map<Character, Integer> countAlphabet = new HashMap<>();

        for (char ch : word.toCharArray()) {
            countAlphabet.put(ch, countAlphabet.getOrDefault(ch, 0)+1);                
            }

        int maxCount = 0;
        char answer = ' ';
        boolean isTie = false;
        
        for (Character ch : countAlphabet.keySet()) {
            int count = countAlphabet.get(ch);
            if (count > maxCount) {
                maxCount = count;
                answer = ch;
                isTie = false;
            } else if (count == maxCount) {
                isTie = true;
            }
        }

        System.out.println(isTie ? "?" : answer);

        }
    }