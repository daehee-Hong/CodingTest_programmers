class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] string = s.split(" ");

        for (int i = 0; i < string.length; i++) {
            if (string[i].equals("Z")){
                answer -= Integer.parseInt(string[i - 1]);
            }else{
                answer += Integer.parseInt(string[i]);
            }
        }

        return answer;
    }
}