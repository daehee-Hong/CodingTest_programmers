
import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) map.put(players[i], i);

        for (int i = 0; i < callings.length; i++) {
            int index = map.get(callings[i]);
            String before = players[index - 1];

            players[index] = before;
            players[index - 1] = callings[i];

            map.put(before, index);
            map.put(callings[i], index - 1);
        }

        return players;
    
    }
}