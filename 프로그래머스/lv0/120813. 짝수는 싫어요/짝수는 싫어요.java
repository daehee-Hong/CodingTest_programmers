import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int index = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0){
                answer[index] += i;
                index++;
            }
        }

        return Arrays.stream(answer).filter(v -> v != 0).toArray();
    }
}