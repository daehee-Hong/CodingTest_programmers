class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int val = length / 2;
        
        if (length % 2 == 0){
            answer += String.valueOf(s.charAt(val - 1));
            answer += String.valueOf(s.charAt(val));
        }else {
            answer = String.valueOf(s.charAt(val));
        }
        
        return answer;
    }
}