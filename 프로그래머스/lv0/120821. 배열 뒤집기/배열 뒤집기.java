import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> result = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}