import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";
        String string1 = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        String[] split = string1.split("");

        for (String s1 : split) {
            if (string1.indexOf(s1) == string1.lastIndexOf(s1)){
                answer += s1;
            }
        }

        return answer;
    }
}