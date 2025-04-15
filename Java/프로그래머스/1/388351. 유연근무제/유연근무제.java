class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < timelogs.length; i++) {
            boolean isSuccess = true;
            
            int planTime = schedules[i];
            int planHour = planTime / 100;
            int planMinute = planTime % 100;
            
            planMinute += 10;
            if (planMinute >= 60) {
                planMinute -= 60;
                planHour += 1;
            }
            int allowedTime = planHour * 100 + planMinute;
            
            for (int j = 0; j < 7; j++) {
                int currentDay = (startday + j - 1) % 7 + 1;
                
                if (currentDay == 6 || currentDay == 7) {
                    continue;
                }
                
                int realtime = timelogs[i][j];
                if (realtime > allowedTime) {
                    isSuccess = false;
                    break;
                }
            }
            
            if (isSuccess) {
                answer++;
            }
        }
        
        return answer;
    }
}