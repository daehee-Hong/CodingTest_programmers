import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (String x : s.split(" ")){
            int cur = Integer.parseInt(x);
            max = Math.max(max, cur);
            min = Math.min(min, cur); 
        }
        answer = min + " " + max;
        return answer;
    }
}