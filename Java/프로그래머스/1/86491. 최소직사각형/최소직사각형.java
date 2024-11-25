import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = sizes[0][0];
        int[] smallnum = new int[sizes.length];

        for(int w=0; w<sizes.length; w++) {
            if (sizes[w][0]>=sizes[w][1]){
                smallnum[w] = sizes[w][1];
            } else {
                smallnum[w] = sizes[w][0];
            }

            for(int h=0; h<sizes[w].length; h++) {               
                if (sizes[w][h]>=max) {
                    max = sizes[w][h];
                }      
            }
        }
                
        int bignum = smallnum[0];
        for(int i=1; i<smallnum.length; i++){    

        if (smallnum[i] > bignum){
            bignum = smallnum[i];
            }
        }

        answer = max * bignum;    
        return answer;
    }
}