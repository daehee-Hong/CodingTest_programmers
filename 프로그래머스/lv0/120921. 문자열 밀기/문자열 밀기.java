import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        List<String> collect = Arrays.stream(A.split("")).collect(Collectors.toList());

        if (A.equals(B)) return 0;
        while (true){
            answer++;
            collect.add(0, collect.get(collect.size() -1));
            collect.remove(collect.size() -1);
            if (String.join("", collect).equals(B)){
                break;
            }
            if (answer > 100){
                answer = -1;
                break;
            }
        }
    
        return answer;
    }
}