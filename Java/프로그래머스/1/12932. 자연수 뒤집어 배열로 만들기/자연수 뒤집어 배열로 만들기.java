class Solution {
    public int[] solution(long n) {
        
        long num = n;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        
        int[] answer = new int[count];
        
        for (int i = 0; i < answer.length; i++){
            int number = (int)(n%10);
            answer[i] = number;
            n /= 10;
        }
        return answer;
    }
}