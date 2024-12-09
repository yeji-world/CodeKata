import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //k: 사과 최고점
        //m: 한 상자 당 사과 개수
        //score: 사과 점수들
        Arrays.sort(score);
        int idx = score.length-m;

        for(int i=1; i<=(score.length/m); i++) {
            if(idx>=0){
            answer += score[idx] * m;
            idx -= m;
            }            
        }            
        return answer;
    }
}