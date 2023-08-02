import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        PriorityQueue<Character> queue = new PriorityQueue<>();
        Stack<Character> stack = new Stack<>();
        for (char s1 : s.toCharArray()) queue.offer(s1);
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            answer += stack.pop();
        }

        return answer;
    }
}