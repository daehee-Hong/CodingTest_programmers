import java.util.*;
class Solution {
    boolean solution(String s) {
                Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '('){
                stack.push(c);
            }else if (c == ')'){
                if (stack.size() > 0) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty() == true ? true : false;
    }
}