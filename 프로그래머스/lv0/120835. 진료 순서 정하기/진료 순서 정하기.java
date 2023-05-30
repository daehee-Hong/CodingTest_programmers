import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(answer);

        for (int i = 0, j = answer.length; i < answer.length; i++, j--) {
            map.put(answer[i], j);
        }
        
        int index = 0;
        for (int i : emergency) {
            answer[index] = map.get(i);
            index++;
        }
        return answer;
    }
}