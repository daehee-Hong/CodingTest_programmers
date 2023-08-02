class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if (length != 4 && length != 6) return false;
        for (char x : s.toCharArray()){
                if (x < 48 || x > 57) return false;
        }
        return answer;
    }
}