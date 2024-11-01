class Solution {
    public long solution(long n) {
        String num = Long.toString(n);

        int digit[] = new int[num.length()];
        int count = 0;
        while (n>0) {
            digit[count] = (int)(n % 10);
            n /= 10;
            count++;
        }    

        for (int i=0; i<digit.length-1; i++) {
            for(int j=i+1; j<digit.length; j++){
               if(digit[i]<digit[j]) {
                    int temp = digit[i];
                    digit[i] = digit[j];
                    digit[j] = temp;
               }
            }        
        } 
        
        long answer = 0;
        for (int i=0; i<digit.length; i++) {
            answer = answer * 10 + digit[i];
        }
        return answer;

    }
}