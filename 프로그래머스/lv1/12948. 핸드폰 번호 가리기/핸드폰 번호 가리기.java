class Solution {
    public static String solution(String phone_number) {
        String answer = "";
        int length = phone_number.substring(0, phone_number.length()-4).length();
        answer = "*".repeat(length) + phone_number.substring(phone_number.length()-4 , phone_number.length());
        return answer;
    }
}