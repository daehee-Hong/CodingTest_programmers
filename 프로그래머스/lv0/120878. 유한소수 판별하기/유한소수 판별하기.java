import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int min = Math.min(a, b);
        int asInt = IntStream.rangeClosed(1, min).filter(v -> a % v == 0 && b % v == 0).max().orElse(1);

        int bunja = a / asInt;
        int bunmo = b / asInt == 1 ? bunja : b / asInt;
        
        if (a % b == 0){
            return 1;
        }
        
        while (bunmo != 1){
            if (bunmo % 2 == 0){
                bunmo /= 2;
            }else if (bunmo % 5 == 0){
                bunmo /= 5;
            }else {
                return 2;
            }
        }

        return 1;
    }
}