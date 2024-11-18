import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> baseThree = new ArrayList<>();
        while(n>0) {            
            baseThree.add(n%3);
            n/=3;            
        }
        Collections.reverse(baseThree);
        for(int i=0; i<baseThree.size(); i++) {
            answer += baseThree.get(i) * Math.pow(3,i);
        }               
        return answer;
    }
}