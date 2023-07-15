class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            String cur = String.valueOf(s.charAt(i));
            String str = sb.toString();

            if (str.indexOf(cur) != -1){
                int result = i - str.lastIndexOf(cur);
                answer[i] = result;
            }else {
                answer[i] = -1;
            }
            sb.append(cur);
        }

        return answer;
    }
}