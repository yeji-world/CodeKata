import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {        
        Map<String, Integer> column = new HashMap<>();
        
        column.put("code", 0);
        column.put("date", 1);
        column.put("maximum", 2);
        column.put("remain", 3);

        int extIdx = column.get(ext);
        int sortIdx = column.get(sort_by);

        List<int[]> list = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIdx] < val_ext) {
                list.add(row);
            }
        }

        list.sort((row1, row2) -> Integer.compare(row1[sortIdx], row2[sortIdx]));

        int[][] answer = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}