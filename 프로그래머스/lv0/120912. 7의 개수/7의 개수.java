import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        String collect = Arrays.stream(array).mapToObj(v -> String.valueOf(v)).collect(Collectors.joining());
        for (String s : collect.split("")) {
            if (s.equals("7")){
                answer++;
            }
        }
        return answer;
    }
}