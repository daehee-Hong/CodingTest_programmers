import java.util.*;

class Solution {
    public int solution(String[] strArr) {
         int answer = 0;
        int[] list = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            list[strArr[i].length()] += 1;
        }
        return Arrays.stream(list).max().getAsInt();
    }
}