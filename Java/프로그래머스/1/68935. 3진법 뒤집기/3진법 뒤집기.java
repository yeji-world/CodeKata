import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> baseThree = new ArrayList<>();
        while(n>0) {            
            baseThree.add(n%3);
            n/=3;            
        }
        // Collections.reverse(baseThree); 안쓴다면
        int count = 0;
        for(int i=baseThree.size()-1; i>=0; i--) {
            answer += baseThree.get(i) * Math.pow(3,count);
            count ++;
        }               
        return answer;
    }
}