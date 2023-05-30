import java.util.*;

class Solution {
    public int solution(int n) {
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            index = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    index++;
                    if (index >= 3){
                        list.add(i);
                    }
                }
            }
        }
        
        return (int) list.stream().distinct().count();
    }
}