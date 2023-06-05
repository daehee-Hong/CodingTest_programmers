import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
         List<Integer> list = Arrays.stream(numlist).sorted().boxed().collect(Collectors.toList());
        list.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
        Collections.reverse(list);
        return list.stream().mapToInt(num -> num).toArray();
    }
}