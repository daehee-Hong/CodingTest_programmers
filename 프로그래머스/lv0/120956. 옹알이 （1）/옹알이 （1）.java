import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        Pattern pattern = Pattern.compile("^[_]+$");

        for (String s : babbling){
            for (String s2 : arr){
                if(s.equals(s2)) {
                    answer++;
                    break;
                }
                else if(s.contains(s2)){
                    s = s.replace(s2, "_");
                    Matcher matcher = pattern.matcher(s);
                    if(matcher.matches()) {
                        answer++;
                        break;
                    };
                }
            }
        }

        return answer;
    }
    
}