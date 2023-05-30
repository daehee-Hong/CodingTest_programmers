import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        String collect1 = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String collect2 = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        
        return collect1.equals(collect2) ? 1 : 0;
    }
}