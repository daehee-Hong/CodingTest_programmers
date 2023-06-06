import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
         String[] answer = new String[quiz.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < quiz.length; i++) {
            String[] s1 = quiz[i].replace(" - ", " -").replace(" + ", " +").replaceAll("-\\+", "-").replaceAll("\\+-", "-").replaceAll("\\+\\+", "+").replaceAll("--", "+").replace(" = ", " =").split(" ");
            for (String s2 : s1) {
                if (stack.isEmpty()){
                    stack.push(Integer.parseInt(s2));
                }else {
                    if (s2.split("")[0].equals("+") || s2.split("")[0].equals("-")){
                        stack.push(stack.pop() + Integer.parseInt(s2));
                    }else if (s2.split("")[0].equals("=")){
                        answer[i] = stack.pop() == Integer.parseInt(s2.replace("=","")) ? "O" : "X";
                        stack.clear();
                    }
                }
            }
        }

        return answer;
    }
}