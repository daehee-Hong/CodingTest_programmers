class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] split = cipher.split("");

        for (int i = 1; i <= split.length; i++) {
            if (i % code == 0){
                answer.append(split[i - 1]);
            }
        }
        return answer.toString();
    }
}