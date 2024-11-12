class Solution {
    public int solution(int[] numbers) {
        int[] temp = new int[10];
        int answer = 0;
        for(int i=0; i<numbers.length; i++) {
            temp[(numbers[i])] += 1; 
        }
        for (int i=0; i<temp.length; i++) {
            if(temp[i]==0) {
                answer += i;
            }
        }
        
        return answer;
    }
}