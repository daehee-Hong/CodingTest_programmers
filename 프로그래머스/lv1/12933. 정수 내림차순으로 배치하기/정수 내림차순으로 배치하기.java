import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str, Collections.reverseOrder());

        for (String s1 : str) {
            sb.append(s1);
        }
        answer = Long.parseLong(sb.toString());

        return answer;
    }
  
}