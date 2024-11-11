class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        int[] numbers = new int[signs.length];
        for (int i=0; i<signs.length; i++) {
            if (signs[i] == true) {
                numbers[i] = absolutes[i];
            } else {
                numbers[i] = -absolutes[i];
            }
     
        }
        for (int i=0; i<numbers.length; i++) {
            answer += numbers[i];
        }
        
        return answer;
    }
}