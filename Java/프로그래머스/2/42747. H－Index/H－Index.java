import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        
        Arrays.sort(citations);
        //h는 citations[i]보다 작거나 같아야 함
        //h <= citations[i]
        //n-i = cotations[i]번 인용된 논문의 수
        for(int i=0; i<n; i++){
              if(citations[i]>=n-i){
                  answer = n-i;
                  break;
              }   
        }

        return answer;
    }
}