import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        String answer = "";

        List<Character> collect = String.valueOf(age).chars().mapToObj(v -> (char) v).map(v -> v - 48 + 97).mapToInt(Integer::intValue).mapToObj(v -> (char) v).collect(Collectors.toList());
        for (Character character : collect) {
            answer += character;
        }

        return answer;
    }
}