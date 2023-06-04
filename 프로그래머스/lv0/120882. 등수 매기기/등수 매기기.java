import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> collect = Arrays.stream(score).map(v -> (v[0] + v[1])).mapToInt(Integer::intValue).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        int[] answer = new int[collect.size()];

        for (int i = 0; i < collect.size(); i++) {
            answer[i] = collect.indexOf((score[i][0] + score[i][1])) + 1;
        }

        return answer;
    }
}