import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        List<Integer> answer = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) min = Math.min(min, arr[i]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min)
                answer.add(arr[i]);
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}