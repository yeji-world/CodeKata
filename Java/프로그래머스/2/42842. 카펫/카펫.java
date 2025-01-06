class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for(int row = 3; row < area; row++) {
            int col = area / row;
            if(area % row == 0 & row >= col) {
                int yellow_area = (row-2) * (col-2);
                if(yellow_area == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                }
            }           
        }        
        return answer;
    }
}