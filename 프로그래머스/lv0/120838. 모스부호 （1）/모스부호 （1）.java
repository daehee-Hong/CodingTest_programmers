class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] strings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : letter.split(" ")) {
            for (int i = 0; i < strings.length; i++) {
                if (s.equals(strings[i])){
                    answer += (char) (i + 97);
                }
            }
        }
        
        return answer;
    }
}