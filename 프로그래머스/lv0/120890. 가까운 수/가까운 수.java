import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            int i1 = Math.abs(array[i] - n);
            if (i1 < min){
                System.out.println("i1 = " + i1);
                min = i1;
                answer = array[i];
            }
        }
        
        return answer;
    }
}