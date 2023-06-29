import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] list = new int[j - i + 1];
            int index = 0;
            for (int l = i; l <= j; l++) {
                list[index] = array[l - 1];
                index++;
            }
            Arrays.sort(list);
            
            answer[idx] = list[k - 1];
            idx++;
        }
        return answer;
    }
}