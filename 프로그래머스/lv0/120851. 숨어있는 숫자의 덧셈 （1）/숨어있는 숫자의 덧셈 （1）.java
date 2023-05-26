class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", "");
        for (char a : s.toCharArray()) {
            int i = a - '0';
            answer += i;
        }
        return answer;
    }
}