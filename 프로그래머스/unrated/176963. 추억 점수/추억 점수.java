import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) map.put(name[i], yearning[i]);
        
        int index = 0;
        for (String [] strList : photo){
            int sum = 0;
            for (String str : strList){
                if (map.containsKey(str)){
                    sum += map.get(str);
                }
            }
            answer[index++] = sum; 
        }
        
        return answer;
    }
}