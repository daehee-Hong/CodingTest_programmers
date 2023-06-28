class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int index = 0;
        for (String s : targets){
            int sum = 0;
            for (char c : s.toCharArray()){
                int min = Integer.MAX_VALUE;

                for (String key : keymap){
                    if (key.indexOf(c) != -1) {
                        min = Math.min(min, (key.indexOf(c) + 1));
                    }
                }
                if (min == Integer.MAX_VALUE) {
                        sum = -1;
                        break;
                    }else {
                        sum += min;
                    }
            }
            answer[index++] = sum;
        }

        return answer;
    }
}