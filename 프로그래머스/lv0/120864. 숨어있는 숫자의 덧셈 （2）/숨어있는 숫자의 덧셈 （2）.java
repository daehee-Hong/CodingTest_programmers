import java.util.*;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-zA-z]", "-").split("-")).filter(v -> !"".equals(v)).mapToInt(Integer::parseInt).sum();
    }
}