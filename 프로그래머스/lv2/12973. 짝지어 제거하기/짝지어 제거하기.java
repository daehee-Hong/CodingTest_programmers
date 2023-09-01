import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        String[] strList = s.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(strList[i])){
                stack.pop();
            }else {
                stack.push(strList[i]);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}