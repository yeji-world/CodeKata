class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int highRanking = 0;
        int lowRanking = 0;
        int[] answer = new int[2];

        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                if (lottos[i]==win_nums[j]) {
                    highRanking ++;
                    lowRanking ++;
                }
            }

            if (lottos[i] == 0) {
                    highRanking ++;
                }
        } 
        
        answer[0] = rankLotto(highRanking);
        answer[1] = rankLotto(lowRanking);
        
        return answer;
    }
        
        public int rankLotto(int ranking) {            
                switch(ranking) {
                case 6:
                return 1;
                case 5:
                return 2;
                case 4:
                return 3;
                case 3:
                return 4;
                case 2:
                return 5;
                default:
                return 6;                 
                }
        }        
}