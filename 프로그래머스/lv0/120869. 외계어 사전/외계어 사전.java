import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        String collect = Arrays.stream(spell).sorted().collect(Collectors.joining());
        String[] array = Arrays.stream(dic).map(v -> Arrays.stream(v.split("")).sorted().collect(Collectors.joining())).toArray(String[]::new);

        for (String s : array) {
            if (collect.equals(s)){
                answer = 1;
            }
        }

        return answer;
    }
}