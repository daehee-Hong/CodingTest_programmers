import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
            .map(v -> v.toUpperCase().equals(v) ? v.toLowerCase() : v.toUpperCase())
            .collect(Collectors.joining());
    }
}