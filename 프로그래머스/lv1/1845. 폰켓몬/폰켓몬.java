import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for (int i : map.keySet()) answer++;
        
        if (answer > len) answer = len;
        
        return answer;
    }
}