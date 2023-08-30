import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int count = 0;
        while (s.length() != 1){
            for (char c : s.toCharArray()) if (c == '0') zeroCount++;
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            count++;
        }
        answer[0] = count;
        answer[1] = zeroCount;
        return answer;
    }
}