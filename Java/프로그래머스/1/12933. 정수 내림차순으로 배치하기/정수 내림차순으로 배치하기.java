import java.util.*;

class Solution {
    public long solution(long n) {
       long answer = 0;
        
        String num = String.valueOf(n);
        String digit[] = num.split("");

        Arrays.sort(digit);
        String str = "";

        for(int i = digit.length-1; i >= 0; i--){
             str+= digit[i];
        }

        answer = Long.parseLong(str);      
        

        return answer;
    }
}