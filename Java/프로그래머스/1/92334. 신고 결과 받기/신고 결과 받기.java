import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] result = new int[id_list.length];    

        Map<String, Set<String>> reportMap = new HashMap<>();        
        Map<String, Integer> countReported = new HashMap<>();
        
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            countReported.put(id, 0);
        }

        for (String r : report) {
            String[] users = r.split(" ");
            String reporter = users[0];
            String reported = users[1];            

            reportMap.get(reporter).add(reported);
        }

        for (String reporter : reportMap.keySet()) {
            for (String reported : reportMap.get(reporter)) {
                countReported.put(reported, countReported.get(reported)+1);
            }
        }

        for (String reporter : reportMap.keySet()) {
            for (String reported : reportMap.get(reporter)) {
                if (countReported.get(reported) >= k) {
                    result[Arrays.asList(id_list).indexOf(reporter)]++;
                }
            }
        }        
        return result;
    }
}