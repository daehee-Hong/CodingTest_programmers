import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box)
                .map(v -> v / n)
                .reduce((x, y) -> x * y)
                .getAsInt();
    }
}