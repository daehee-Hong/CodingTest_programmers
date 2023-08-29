import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            int j = 0;
            String cur = str[i].toLowerCase();
            for (char x : cur.toCharArray()){
                if(!Character.isDigit(x) && j == 0) answer.append(Character.toUpperCase(x));
                else answer.append(x);
                j++;
            }
            j = 0;
            if (i != str.length-1) answer.append(" ");
        }
        if (s.split("")[s.length()-1].equals(" ")) answer.append(" ");

        return answer.toString();
    }
}