import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int i, int j, int k) {
         return (int) Arrays.stream(IntStream.range(i, j + 1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .split(""))
                .filter(v -> String.valueOf(k).contains(v))
                .count();
    }
}