import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] strings = my_string.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        
        for (int i = 0; i < strings.length; i++){
            if ("+".equals(strings[i])){
                if (stack.isEmpty()){
                    stack.push(Integer.parseInt(strings[i - 1]) + Integer.parseInt(strings[i + 1]));
                }else {
                    stack.push(stack.pop() + Integer.parseInt(strings[i + 1]));
                }
            }else if ("-".equals(strings[i])){
                if (stack.isEmpty()){
                    stack.push(Integer.parseInt(strings[i - 1]) - Integer.parseInt(strings[i + 1]));
                }else {
                    stack.push(stack.pop() - Integer.parseInt(strings[i + 1]));
                }
            }
        }
        
        return stack.pop();
    }
}