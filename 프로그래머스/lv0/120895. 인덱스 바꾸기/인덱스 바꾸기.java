class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        char[] chars = my_string.toCharArray();

        sb.setCharAt(num1, chars[num2]);
        sb.setCharAt(num2, chars[num1]);

        answer = sb.toString();
        return answer;
    }
}