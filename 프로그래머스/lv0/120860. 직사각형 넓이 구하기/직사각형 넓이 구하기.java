import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int[] array = Arrays.stream(dots).map(v -> v[0]).sorted().mapToInt(Integer::intValue).toArray();
        int[] array2 = Arrays.stream(dots).map(v -> v[1]).sorted().mapToInt(Integer::intValue).toArray();

        int x = array[array.length - 1] - array[0];
        int y = array2[array2.length - 1] - array2[0];

        answer = x * y;

        return answer;
    }
}