import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> startRating = new HashMap<>();        

        for (int i = 0; i < players.length; i++) {
            startRating.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int now = startRating.get(callings[i]); 
            
                String playerBefore = players[now - 1];
                
                startRating.put(playerBefore, now);
                startRating.put(callings[i], now - 1);

                players[now - 1] = callings[i];
                players[now] = playerBefore;
            }
        
        for (int i = 0; i < players.length; i++) {
            answer[i] = players[i];
        }

        return answer;
    }
}