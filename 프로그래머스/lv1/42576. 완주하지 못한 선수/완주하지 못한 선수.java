import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : participant){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for (String s : completion){
            if(map.get(s) > 0){
                map.put(s, map.get(s) - 1);
            }else {
                map.remove(s);
            }
        }
        
        for(String key : map.keySet()){
            if(map.get(key) == 1) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}