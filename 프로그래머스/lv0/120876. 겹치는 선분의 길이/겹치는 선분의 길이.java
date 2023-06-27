import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] arr : lines){
            int start = arr[0];
            int end = arr[1];

            for (int i = start; i < end; i++){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for (Integer x : map.keySet()) {
            if (map.get(x) > 1){
                answer++;
            }
        }

        return answer;
    }
}