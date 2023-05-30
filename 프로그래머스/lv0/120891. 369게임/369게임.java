import java.util.*;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).mapToInt(Integer::parseInt).filter(v -> v == 3 || v == 6 || v == 9).count();
    }
}