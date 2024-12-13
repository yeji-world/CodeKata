import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        //빵:1, 야채:2, 고기:3 -> 1,2,3,1
        List<Integer> igd = new ArrayList<>();
        for(int i=0; i<ingredient.length; i++){            
            igd.add(ingredient[i]);
            int size = igd.size();
            if(size >= 4            
               && igd.get(size-1)==1
               && igd.get(size-2)==3
               && igd.get(size-3)==2
               && igd.get(size-4)==1
              ){
                answer++;
                igd.remove(size-1);
                igd.remove(size-2);
                igd.remove(size-3);
                igd.remove(size-4);
            }                 
        }
        return answer;
    }
}