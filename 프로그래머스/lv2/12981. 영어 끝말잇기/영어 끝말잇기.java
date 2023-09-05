import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String[] arr = new String[words.length-1];

        int count = 1;
        int i = 0;
        List<String> list = new LinkedList<>();
        Queue<Integer> nQ = new LinkedList<>();
        //for (String word : words) list.add(word);
        for (int k = 1; k <= n; k++) nQ.offer(k);
        try {
            while (!nQ.isEmpty()){
                if (n == nQ.peek()) count++;

                if (words[i].length() <= 1){
                    answer[0] = nQ.poll();
                    answer[1] = count;
                    return answer;
                }

                if (words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
                    if (list.contains(words[i])){
                        answer[0] = nQ.poll();
                        answer[1] = count;
                        return answer;
                    }
                    nQ.poll();
                    answer[0] = nQ.poll();
                    answer[1] = count;
                    return answer;
                }

                if (list.contains(words[i])){
                    answer[0] = nQ.poll();
                    answer[1] = count;
                    return answer;
                }

                list.add(words[i]);
                i++;
                nQ.offer(nQ.poll());
            }

        }catch (Exception e){
            e.printStackTrace();
            if (list.contains(words[i])){
                answer[0] = nQ.poll();
                answer[1] = count-1;
                return answer;
            }
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}