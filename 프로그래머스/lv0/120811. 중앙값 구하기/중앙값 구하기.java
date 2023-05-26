import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] array1 = Arrays.stream(array).sorted().toArray();
        int i = array1[array1.length / 2];
        return i;
    }
}